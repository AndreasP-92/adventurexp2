package backendadventurexp.demo.repository;


import backendadventurexp.demo.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ActivityRepository extends JpaRepository<Activity, Long> {

    //    List<Activity> findByActivity_name(Long id);
    public Activity findByName(String name);
    List<Activity> findAllByName(String name);
    public Activity findById(int id);
}
