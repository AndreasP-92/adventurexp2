package backendadventurexp.demo.controller;

import backendadventurexp.demo.model.*;
import backendadventurexp.demo.repository.AuthRepository;
import backendadventurexp.demo.repository.ProfileAboutRepository;
import backendadventurexp.demo.repository.ProfileRepository;
import backendadventurexp.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfileController {

    @Autowired
    ProfileRepository profileRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    AuthRepository authRepository;

//    ==================================================== GET PROFILES ================================================

    // === GETS ALL PROFILES ===
    @GetMapping("/profiles")
    public List<Profile> getProfiles() {
        List<Profile> profiles = profileRepository.findAll();
        return profiles;
    }

    // === GETS ALL PROFILES WITH MAIL ===
    @GetMapping("/select/all/profiles/{mail}")
    public List findAllProfilesWMail(@PathVariable String mail){
        List<Profile> profileList = profileRepository.findByMail(mail);

        return profileList;
    }


    //    =======  GETS ONE PROFILE =====
    @GetMapping("/select/one/profile/{id}")
    public Profile findById(@PathVariable int id) {
        Profile profile = profileRepository.findById(id);

        return profile;
    }
//    ==================================================== POST PROFILES ===============================================

    // === INSERT ONE PROFILE ===
    @PostMapping(value = "/insert/profile", consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Profile insertProfile(@RequestBody Profile profile) {
        System.out.println(profile);

        return profileRepository.save(profile);
    }

    // === INSERT ONE PROFILE ===
    @PostMapping(value = "/insert/profile/about", consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Profile insertProfileAboutInfo(@RequestBody Profile profile) {
        System.out.println(profile);

        return profileRepository.save(profile);
    }

//    ==================================================== DELETE PROFILES =============================================
    // === DELETE ONE PROFILE ===
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    @DeleteMapping("/delete/profile/about/{user_id}")
    public void deleteProfileInfo(@PathVariable int user_id) {
        try {
            profileRepository.deleteById(user_id);
        } catch (EmptyResultDataAccessException ex) {
            System.out.println("ERROR DELETING =" + ex.getMessage());
        }
    }

    // === INSERT EDIT ONE PROFILE ===
    @ResponseStatus(code=HttpStatus.OK)
    @PostMapping("/edit/profile")
    public void profileEdit(@RequestBody Profile profile){
        System.out.println("PROFILE ==="+profile);
        Profile profile1 = profileRepository.findById(profile.getId());
        System.out.println(profile1);
        Users users = userRepository.findByMail(profile1.getMail());
        Auth auth = authRepository.findByMail(profile1.getMail());

        System.out.println(profile1);
        profile1.setFirstname(profile.getFirstname());
        profile1.setLastname(profile.getLastname());
        profile1.setMail(profile.getMail());
        profile1.setPhone(profile.getPhone());
        profile1.setPassword(profile.getPassword());
        profile1.setRole(profile.getRole());

        users.setMail(profile.getMail());
        users.setPassword(profile.getPassword());
        users.setRole(profile.getRole());

        auth.setMail(profile.getMail());
        auth.setRole(profile.getRole());

        profileRepository.save(profile1);
        userRepository.save(users);
        authRepository.save(auth);
    }
}
