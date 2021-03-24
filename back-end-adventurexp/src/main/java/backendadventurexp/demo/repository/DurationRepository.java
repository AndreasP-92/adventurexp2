package backendadventurexp.demo.repository;

import backendadventurexp.demo.model.Activity;
import backendadventurexp.demo.model.Duration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DurationRepository extends JpaRepository<Duration, Long> {

//    List<Duration> findAll(String name);
}
