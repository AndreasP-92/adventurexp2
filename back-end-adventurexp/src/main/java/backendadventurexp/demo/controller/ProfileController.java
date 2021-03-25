package backendadventurexp.demo.controller;

import backendadventurexp.demo.model.Booking;
import backendadventurexp.demo.model.Profile;
import backendadventurexp.demo.model.ProfileAbout;
import backendadventurexp.demo.repository.ProfileAboutRepository;
import backendadventurexp.demo.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfileController {

    @Autowired
    ProfileRepository profileRepository;

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

    //    ==================================================== POST PROFILES ================================================

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

    //    ==================================================== DELETE PROFILES ================================================
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

}
