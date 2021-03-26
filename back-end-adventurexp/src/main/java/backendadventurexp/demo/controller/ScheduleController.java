package backendadventurexp.demo.controller;

import backendadventurexp.demo.model.Schedule;
import backendadventurexp.demo.model.Users;
import backendadventurexp.demo.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ScheduleController {

    @Autowired
    ScheduleRepository scheduleRepository;

//    GET ALL SHIFTS
    @GetMapping("/select/all/schedules")
    public List getAllShifts(){
        List <Schedule> schedules = scheduleRepository.findAll();

        return schedules;
    }

//    INSERT A SHIFT
    @PostMapping(value = "/insert/shift", consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Schedule insertUser(@RequestBody Schedule schedule) {
        System.out.println(schedule);

        return scheduleRepository.save(schedule);
    }

}
