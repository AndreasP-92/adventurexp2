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

    public ActivityController(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    @GetMapping("/select/activities")
    public List<Activity> getActivities(){
        List<Activity> activities = activityRepository.findAll();

        return activities;
    }

    @GetMapping("/select/durations")
    public List<Duration> getDurations(){
        List<Duration> durations = durationRepository.findAll();

        return durations;
    }

    @PostMapping(value="/insert/activity", consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Activity insertActivity(@RequestBody Activity activity){

        return activityRepository.save(activity);

    }

}
