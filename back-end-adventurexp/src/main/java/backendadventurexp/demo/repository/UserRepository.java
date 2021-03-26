package backendadventurexp.demo.repository;

import backendadventurexp.demo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<Users, Integer> {
    Users findById(int id);
    Users findByMail(String mail);
    List<Users> findAllByMailAndRole(String mail, String role);
    Users deleteById(int id);
}
