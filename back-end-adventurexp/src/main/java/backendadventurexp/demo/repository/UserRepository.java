package backendadventurexp.demo.repository;

import backendadventurexp.demo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {

    Users findById(int id);
    Users findByMail(String mail);
}
