package backendadventurexp.demo.controller;

import backendadventurexp.demo.model.ProfileAbout;
import backendadventurexp.demo.repository.ProfileAboutRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ProfileAboutController {

    private final ProfileAboutRepository profileAboutRepository;

    public ProfileAboutController(ProfileAboutRepository profileAboutRepository) {
        this.profileAboutRepository = profileAboutRepository;
    }

    @GetMapping("/select/profile/about")
    public List<ProfileAbout> findAllProfiles() {
        List<ProfileAbout> profileAbouts = profileAboutRepository.findAll();
        return profileAbouts;
    }

//    @GetMapping("/select/one/profile/about/{mail}")
//    public List<ProfileAbout> findByUserMail(@PathVariable String mail){
//        List<ProfileAbout> profileAboutOneMail = profileAboutRepository.findByUser_mail(mail);
//        return profileAboutOneMail;

//    @GetMapping("/select/one/profile/about/{mail}")
//    public ProfileAbout findByUserMail(@PathVariable String mail){
//        ProfileAbout profileAboutOneMail = profileAboutRepository.findByUser_mail(mail);
//        return profileAboutOneMail;
//    }


    @PostMapping(value = "/profile/abouts", consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public ProfileAbout postNewProfileInfo(@RequestBody ProfileAbout profileABout) {
        System.out.println(profileABout);
        return profileAboutRepository.save(profileABout);
    }

    @PostMapping(value = "/insert/profile/about", consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public ProfileAbout insertProfileAboutInfo(@RequestBody ProfileAbout insertProfileAboutInfo) {
        System.out.println(insertProfileAboutInfo);

        return profileAboutRepository.save(insertProfileAboutInfo);
    }

    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    @DeleteMapping("/delete/profile/about/{user_id}")
    public void deleteProfileInfo(@PathVariable int user_id) {
        try {
            profileAboutRepository.deleteById(user_id);
        } catch (EmptyResultDataAccessException ex) {
            System.out.println("FEJL i DELETE =" + ex.getMessage());
        }
    }

}
