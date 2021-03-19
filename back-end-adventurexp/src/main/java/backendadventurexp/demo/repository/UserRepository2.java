package backendadventurexp.demo.repository;

import backendadventurexp.demo.controller.User2;
import backendadventurexp.demo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository2 extends JpaRepository<User2, Long> {

    public Users findByEmail(String email);
    public Users findByLastName(String lastName);

}