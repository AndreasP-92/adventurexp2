package backendadventurexp.demo.controller;

import backendadventurexp.demo.model.Auth;
import backendadventurexp.demo.model.Users;
import backendadventurexp.demo.repository.AuthRepository;
import backendadventurexp.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;


@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    AuthRepository authRepository;

//    ==================================================== GET PROFILES ================================================

    //     === SELECT BOOKING ===
    @GetMapping(value="/select/user/{mail}")
    public Users insertBooking(@PathVariable String mail){
        System.out.println(mail);

        Users user = userRepository.findByMail(mail);

        System.out.println("USER FOUND==="+user);

        return user;
    }

//     === INSERT BOOKING ===
    @GetMapping(value="/search/user/{mail}/{role}")
    public List<Users> searchUser(@PathVariable("mail") String mail, @PathVariable("role") String role){
        System.out.println(mail);
        System.out.println(role);
//        http://localhost:5002/search/user/and@and&USER_ADMIN
        List<Users> users = userRepository.findAllByMailAndRole(mail, role);

        System.out.println("USER FOUND==="+users);

        return users;
    }

    @GetMapping(value="/search/auth/{role}")
    public List<Auth> searchAuth(@PathVariable String role){
        System.out.println(role);

        List<Auth> auths = authRepository.findAllByRole(role);

        System.out.println("USER FOUND==="+auths);

        return auths;
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

//    ==================================================== DELETE PROFILE ================================================

    @ResponseStatus(code=HttpStatus.NO_CONTENT)
    @DeleteMapping("/delete/profile/{id}")
    public void deleteProfile(@PathVariable int id){
        System.out.println("ID=============="+id);
        try {
            userRepository.deleteById(id);
        } catch (EmptyResultDataAccessException ex) {
            System.out.println("FEJL i DELETE =" + ex.getMessage());
        }
    }
}
