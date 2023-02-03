package eric.springframework.msscbeerservice.services;

import eric.springframework.msscbeerservice.repositories.BeerRepository;
import eric.springframework.msscbeerservice.web.mappers.BeerMapper;

import java.util.UUID;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {BeerServiceImpl.class})
@ExtendWith(SpringExtension.class)
class BeerServiceImplTest {
    @MockBean
    private BeerMapper beerMapper;

    @MockBean
    private BeerRepository beerRepository;

    @Autowired
    private BeerServiceImpl beerServiceImpl;

    /**
     * Method under test: {@link BeerServiceImpl#deleteById(UUID)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDeleteById() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NumberFormatException: For input string: "e0407e19-bdc0-482b-84d6-3046565166cb"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:692)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at eric.springframework.msscbeerservice.services.BeerServiceImpl.deleteById(BeerServiceImpl.java:49)
        //   See https://diff.blue/R013 to resolve this issue.

        beerServiceImpl.deleteById(UUID.randomUUID());
    }

    /**
     * Method under test: {@link BeerServiceImpl#deleteById(UUID)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDeleteById2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at eric.springframework.msscbeerservice.services.BeerServiceImpl.deleteById(BeerServiceImpl.java:49)
        //   See https://diff.blue/R013 to resolve this issue.

        beerServiceImpl.deleteById(null);
    }
}

