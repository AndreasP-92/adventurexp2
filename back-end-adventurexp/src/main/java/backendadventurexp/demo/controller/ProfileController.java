package backendadventurexp.demo.controller;

import backendadventurexp.demo.model.Profile;
import backendadventurexp.demo.repository.ProfileRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

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



    @PostMapping(value = "/insert/profile", consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Profile insertProfile(@RequestBody Profile profile) {
        System.out.println(profile);

        return profileRepository.save(profile);
    }
}
