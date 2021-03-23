package backendadventurexp.demo.repository;

import backendadventurexp.demo.model.Duration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DurationRepository extends JpaRepository<Duration, Long> {

}
