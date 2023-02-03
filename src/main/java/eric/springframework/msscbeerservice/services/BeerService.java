package eric.springframework.msscbeerservice.services;

import eric.springframework.msscbeerservice.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateById(UUID beerId, BeerDto beerDto);

    BeerDto deleteById(UUID id);
}
