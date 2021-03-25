package backendadventurexp.demo.controller;

import backendadventurexp.demo.model.Activity;
import backendadventurexp.demo.model.Duration;
import backendadventurexp.demo.repository.ActivityRepository;
import backendadventurexp.demo.repository.DurationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ActivityController {

    @Autowired
    ActivityRepository activityRepository;

    @Autowired
    DurationRepository durationRepository;

//    ==================================================== GET PROFILES ================================================

//    ====== SELECT ALL ACTIVITIES =====
    @GetMapping("/select/activities")
    public List<Activity> getActivities(){
        List<Activity> activities = activityRepository.findAll();

        return activities;
    }

//    ====== SELECT ONE ACTIVITIES =====
    @GetMapping("/select/activity/{name}")
    public Activity getOneActivityWName(@PathVariable String name){
        Activity activity = activityRepository.findByName(name);

        return activity;
    }

//    ====== SELECT ALL ACTIVITIES WITH NAME =====
    @GetMapping("/select/all/events/{name}")
    public List<Activity> getAllEventsWName(@PathVariable String name){
        System.out.println(name);
        List<Activity> activities = activityRepository.findAllByName(name);

        return activities;
    }

//    ====== SELECT ALL DURATIONS =====
    @GetMapping("/select/durations")
    public List<Duration> getDurations(){
        List<Duration> durations = durationRepository.findAll();

        return durations;
    }

//    ====== SELECT ALL DURATIONS WITH NAME =====
    @GetMapping("/select/all/durations/{activity}")
    public List<Duration> getDurationsWName(@PathVariable String activity){
        List<Duration> durations = durationRepository.findAllByActivityName(activity);

        return durations;
    }

//    ==================================================== POST PROFILES ================================================

    @PostMapping(value="/insert/duration", consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Duration insertDuration(@RequestBody Duration duration){

        return durationRepository.save(duration);

    }

    @PostMapping(value="/insert/activity", consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Activity insertActivity(@RequestBody Activity activity){

        return activityRepository.save(activity);

    }

}
