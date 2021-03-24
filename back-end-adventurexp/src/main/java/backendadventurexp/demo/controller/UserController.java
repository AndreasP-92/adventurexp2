package backendadventurexp.demo.controller;

import backendadventurexp.demo.model.Auth;
import backendadventurexp.demo.model.Users;
import backendadventurexp.demo.repository.AuthRepository;
import backendadventurexp.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    AuthRepository authRepository;

//    ==================================================== GET PROFILES ================================================

    //     === INSERT BOOKING ===
    @GetMapping(value="/select/user/{mail}")
    public Users insertBooking(@PathVariable String mail){
        System.out.println(mail);

        Users user = userRepository.findByMail(mail);

        System.out.println("USER FOUND==="+user);

        return user;
    }

//    ==================================================== POST PROFILES ================================================

    //     === INSERT USER ===
    @PostMapping(value = "/insert/user", consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Users insertUser(@RequestBody Users users) {
        System.out.println(users);

        return userRepository.save(users);
    }

//     === INSERT AUTH ===
    @PostMapping(value = "/insert/auth", consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Auth insertAuth(@RequestBody Auth auth) {
        System.out.println(auth);

        return authRepository.save(auth);
    }


//     === UPDATE ONE PROFILE ===
    @PostMapping(value = "/update/user", consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public void updateUserCredentinals(@RequestBody Users users) {
        System.out.println("USERS ==="+users);
        Users oneUser = userRepository.findById(users.getId());
        oneUser.setMail(users.getMail());
        if(users.getPassword() != null){
            oneUser.setPassword(users.getPassword());
        }
        System.out.println("ONE USER ==="+oneUser);
        userRepository.save(oneUser);
    }
}
