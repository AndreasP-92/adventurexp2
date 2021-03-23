package backendadventurexp.demo.controller;



import backendadventurexp.demo.model.Auth;
import backendadventurexp.demo.model.Users;
import backendadventurexp.demo.repository.AuthRepository;
import backendadventurexp.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @GetMapping(value="/select/user/{mail}")
    public Users insertBooking(@PathVariable String mail){
        System.out.println(mail);

        Users user = userRepository.findByMail(mail);

        System.out.println("USER FOUND==="+user);

        return user;
    }

//     === UPDATE ONE PROFILE ===
    @PostMapping(value = "/update/user", consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public void updateUserCredentinals(@RequestBody Users users) {
        System.out.println("USERS ==="+users);
//        Users oneUser2 = userRepository.findById(users.getId());
        Users oneUser = userRepository.findById(users.getId());
        oneUser.setMail(users.getMail());
        if(users.getPassword() != null){
            oneUser.setPassword(users.getPassword());
        }
        System.out.println("ONE USER ==="+oneUser);
        userRepository.save(oneUser);

//        oneUser.set
    }

//    public void updateUser(Userinfos u) {
//        User userFromDb = userRepository.findById(u.getid());
//        // crush the variables of the object found
//        userFromDb.setFirstname("john");
//        userFromDb.setLastname("dew");
//        userFromDb.setAge(16);
//        userRepository.save(userFromDb);
//    }
}
