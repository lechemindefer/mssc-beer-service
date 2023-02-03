package eric.springframework.msscbeerservice.web.controller;

import eric.springframework.msscbeerservice.services.BeerService;
import eric.springframework.msscbeerservice.web.model.BeerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    private final BeerService beerService;

    @GetMapping("/{beerId}")
    ResponseEntity<BeerDto> getBeerId(@PathVariable("beerId") UUID beerId){
        return new ResponseEntity<>(beerService.getById(beerId),HttpStatus.OK);
    }

    @PostMapping("/create")
    ResponseEntity saveNewBeer(@RequestBody @Valid BeerDto beerDto){
        return new ResponseEntity(beerService.saveNewBeer(beerDto),HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    ResponseEntity updateBeerId(@PathVariable("beerId") UUID beerId,@RequestBody @Valid BeerDto beerDto){
        return new ResponseEntity(beerService.updateById(beerId,beerDto),HttpStatus.NO_CONTENT);
    }
    @DeleteMapping("/{beerId}")
    ResponseEntity<String> deletedBeer(@PathVariable UUID id){
       return  new ResponseEntity("beerService.deleteById(id)",HttpStatus.valueOf("BeerDto deleted"));
    }
}
