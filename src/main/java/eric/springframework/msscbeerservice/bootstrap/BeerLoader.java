package eric.springframework.msscbeerservice.bootstrap;

import eric.springframework.msscbeerservice.domain.Beer;
import eric.springframework.msscbeerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;

import java.math.BigDecimal;

public class BeerLoader implements CommandLineRunner {

    public static final String BEER_1_UPC = "1234567001";
    public static final String BEER_2_UPC = "1234567002";
    public static final String BEER_3_UPC = "1234567003";

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository){
        this.beerRepository=beerRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        loadBeerObject();
    }

    private void loadBeerObject(){
        if (beerRepository.count()==0){
            beerRepository.save(Beer.builder()
                    .beerName("Mango Bobs")
                    .beerStyle("IPA")
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .upc(BEER_1_UPC)
                    .price(new BigDecimal("23,95"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Galaxy Cat")
                    .beerStyle("PALE_ALE")
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .upc(BEER_2_UPC)
                    .price(new BigDecimal("240,95"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Iphone 14")
                    .beerStyle("MAX_EXTRA")
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .upc(BEER_3_UPC)
                    .price(new BigDecimal("1500,50"))
                    .build());
        }
    }
}
