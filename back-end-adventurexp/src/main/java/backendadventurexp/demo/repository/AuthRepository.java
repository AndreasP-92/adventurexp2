package backendadventurexp.demo.repository;

import backendadventurexp.demo.model.Auth;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthRepository extends JpaRepository<Auth, Long> {
    List<Auth> findAllByRole(String mail);
}
