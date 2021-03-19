package backendadventurexp.demo.controller;



import backendadventurexp.demo.model.Users;
import backendadventurexp.demo.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

public class UserController {

    UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<Users> getProfiles(Model model) {
        List<Users> user = userRepository.findAll();
        return user;
    }

    @PostMapping(value = "/insert/user", consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Users insertUser(@RequestBody Users user) {
        System.out.println(user);

        return userRepository.save(user);
    }
}
