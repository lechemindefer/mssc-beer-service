package eric.springframework.msscbeerservice.services;

import eric.springframework.msscbeerservice.domain.Beer;
import eric.springframework.msscbeerservice.repositories.BeerRepository;
import eric.springframework.msscbeerservice.web.mappers.BeerMapper;
import eric.springframework.msscbeerservice.web.model.BeerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class BeerServiceImpl implements BeerService {

    private final BeerRepository beerRepository;
    private final BeerMapper beerMapper;

    @Override
    public BeerDto getById(UUID beerId) {
        return beerMapper.beerToBeerDto(beerRepository.findById(Long.parseLong(beerId.toString())).orElseThrow(()->new RuntimeException()));
    }

    @Override
    public BeerDto saveNewBeer(BeerDto dto) {
        return beerMapper.beerToBeerDto(beerRepository.save(beerMapper.beerDtoToBeer(dto)));
    }

    @Override
    public BeerDto updateById(UUID beerId, BeerDto beerDto) {
        Optional<Beer> beer = beerRepository.findById(Long.parseLong(beerId.toString()));

        if (beer.isEmpty()) {
            return null;
        }

        Beer b = beer.get();
        b.setBeerName(beerDto.getBeerName());
        b.setBeerStyle(beerDto.getBeerStyle().name());
        b.setPrice(beerDto.getPrice());
        b.setUpc(beerDto.getUpc());

        return beerMapper.beerToBeerDto(beerRepository.save(b));

    }

    @Override
    public BeerDto deleteById(UUID id) {
        Optional<Beer> optional = beerRepository.findById(Long.parseLong(id.toString()));
        if(optional.isPresent()){
            beerRepository.deleteById(Long.parseLong(id.toString()));
            return beerMapper.beerToBeerDto(optional.get());
        }
        return null;
    }
}
