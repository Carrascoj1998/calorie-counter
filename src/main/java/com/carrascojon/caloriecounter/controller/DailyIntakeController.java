package com.carrascojon.caloriecounter.controller;

import com.carrascojon.caloriecounter.model.DailyIntake;
import com.carrascojon.caloriecounter.model.User;
import com.carrascojon.caloriecounter.model.dto.DailyIntakeDTO;
import com.carrascojon.caloriecounter.service.impl.DailyIntakeServiceImpl;
import com.carrascojon.caloriecounter.service.impl.UserServiceImpl;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dailyIntake")
@RequiredArgsConstructor
public class DailyIntakeController {

    private final DailyIntakeServiceImpl dailyIntakeService;
    private final UserServiceImpl userService;


    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Optional<DailyIntake> getDailyIntake(@PathVariable Long id){
        return dailyIntakeService.getDailyIntakeById(id);
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Iterable<DailyIntake> getAllDailyIntake(){
        return dailyIntakeService.getAllDailyIntakes();
    }

    @GetMapping("/user/{id}") // Define a new endpoint that takes the user's ID
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<DailyIntake> getDailyIntakesForUser(@PathVariable Long id) {
        User user = userService.getUserById(id)
                .orElseThrow(() -> new EntityNotFoundException("User not found"));
        return dailyIntakeService.findDailyIntakeByUser(user);
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Optional<DailyIntake> savDailyIntake(@RequestBody DailyIntake dailyIntake){
        return Optional.ofNullable(dailyIntakeService.saveDailyIntake(dailyIntake));

    }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void patchDailyIntake(@PathVariable Long id, @RequestBody DailyIntakeDTO dailyIntakeDTO){
        dailyIntakeService.patchDailyIntake(id, dailyIntakeDTO);

    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteById(@PathVariable Long id){
        dailyIntakeService.deleteIntakeById(id);
    }


}
