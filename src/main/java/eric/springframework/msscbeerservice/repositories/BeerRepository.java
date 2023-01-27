package eric.springframework.msscbeerservice.repositories;

import eric.springframework.msscbeerservice.domain.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeerRepository extends JpaRepository<Beer,Long> {
}
