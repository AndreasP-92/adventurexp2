package backendadventurexp.demo.controller;

import backendadventurexp.demo.model.Auth;
import backendadventurexp.demo.model.Profile;
import backendadventurexp.demo.model.Users;
import backendadventurexp.demo.repository.AuthRepository;
import backendadventurexp.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    AuthRepository authRepository;

    @PostMapping(value = "/insert/user", consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Users insertUser(@RequestBody Users users) {
        System.out.println(users);

        return userRepository.save(users);
    }

    @PostMapping(value = "/insert/auth", consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Auth insertAuth(@RequestBody Auth auth) {
        System.out.println(auth);

        return authRepository.save(auth);
    }
}
