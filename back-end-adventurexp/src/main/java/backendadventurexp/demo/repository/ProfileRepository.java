package backendadventurexp.demo.repository;


import backendadventurexp.demo.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Integer> {



}