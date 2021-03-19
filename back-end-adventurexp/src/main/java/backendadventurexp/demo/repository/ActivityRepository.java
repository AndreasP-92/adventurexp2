package backendadventurexp.demo.repository;


import backendadventurexp.demo.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, Long> {
    //    List<Activity> findByActivity_name(Long id);
    public Activity findByName(String name);
}
