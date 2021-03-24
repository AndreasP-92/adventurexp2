package backendadventurexp.demo.repository;


import backendadventurexp.demo.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ActivityRepository extends JpaRepository<Activity, Long> {
     Activity findByName(String name);
    List<Activity> findAllByName(String name);
}
