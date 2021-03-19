package backendadventurexp.demo.controller;

import backendadventurexp.demo.model.Booking;
import backendadventurexp.demo.model.Profile;
import backendadventurexp.demo.repository.ProfileRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfileController {
    ProfileRepository profileRepository;

    public ProfileController(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @GetMapping("/profiles")
    public List<Profile> getProfiles() {
        List<Profile> profiles = profileRepository.findAll();
        return profiles;
    }

    @GetMapping("/select/all/profiles/{mail}")
    public List findAllProfilesWMail(@PathVariable String mail){
        List<Profile> profileList = profileRepository.findByMail(mail);

        return profileList;
    }

    @PostMapping(value = "/insert/profile", consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Profile insertProfile(@RequestBody Profile profile) {
        System.out.println(profile);

        return profileRepository.save(profile);
    }
}
