package com.carrascojon.caloriecounter.service;

import com.carrascojon.caloriecounter.model.DailyIntake;
import com.carrascojon.caloriecounter.model.User;

import java.util.List;
import java.util.Optional;

public interface DailyIntakeService {

    Optional<DailyIntake> getDailyIntakeById(Long id);

    List<DailyIntake> findDailyIntakeByUser(User user);

    Iterable<DailyIntake> getAllDailyIntakes();

    DailyIntake saveDailyIntake(DailyIntake dailyIntake);



    void deleteIntakeById(Long id);

    void deleteDailyIntake(DailyIntake dailyIntake);



}
