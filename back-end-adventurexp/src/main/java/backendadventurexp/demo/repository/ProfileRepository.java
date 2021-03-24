package backendadventurexp.demo.repository;


import backendadventurexp.demo.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfileRepository extends JpaRepository<Profile, Integer> {
    List<Profile> findByMail(String mail);
}