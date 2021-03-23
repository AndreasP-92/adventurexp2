package backendadventurexp.demo.repository;


import backendadventurexp.demo.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ActivityRepository extends JpaRepository<Activity, Long> {
    //    List<Activity> findByActivity_name(Long id);
    public Activity findByName(String name);

    @Query("SELECT id, name, description, age, size, practicalinfo, pic, price FROM activity")
    List<Activity> activityInfo(int id, String name, String description, String age, String size, String practicalinfo, String price)



    @Query("FROM activity WHERE id,name,description,age,size,practicalinfo,price,pic = ?8")
    List<Activity> activityInfo(String location);

}
