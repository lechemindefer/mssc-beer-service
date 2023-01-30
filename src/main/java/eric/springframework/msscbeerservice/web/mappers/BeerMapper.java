package eric.springframework.msscbeerservice.web.mappers;

import eric.springframework.msscbeerservice.domain.Beer;
import eric.springframework.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses ={DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
