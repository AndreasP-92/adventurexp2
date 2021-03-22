package backendadventurexp.demo.controller;

import backendadventurexp.demo.model.ProfileAbout;
import backendadventurexp.demo.repository.ProfileAboutRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfileAboutController {




//    @GetMapping("/select/one/profile/about/{mail}")
//    public List<ProfileAbout> findByUserMail(@PathVariable String mail){
//        List<ProfileAbout> profileAboutOneMail = profileAboutRepository.findByUser_mail(mail);
//        return profileAboutOneMail;

//    @GetMapping("/select/one/profile/about/{mail}")
//    public ProfileAbout findByUserMail(@PathVariable String mail){
//        ProfileAbout profileAboutOneMail = profileAboutRepository.findByUser_mail(mail);
//        return profileAboutOneMail;
//    }




}
