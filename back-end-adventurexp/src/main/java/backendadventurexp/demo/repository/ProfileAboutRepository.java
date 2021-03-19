package backendadventurexp.demo.repository;




import backendadventurexp.demo.model.ProfileAbout;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfileAboutRepository extends JpaRepository<ProfileAbout, Integer> {
//ProfileAbout findByUser_mail(String mail);
}