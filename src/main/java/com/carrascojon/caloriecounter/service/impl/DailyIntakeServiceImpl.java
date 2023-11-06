package com.carrascojon.caloriecounter.service.impl;

import com.carrascojon.caloriecounter.model.DailyIntake;
import com.carrascojon.caloriecounter.model.User;
import com.carrascojon.caloriecounter.model.dto.DailyIntakeDTO;
import com.carrascojon.caloriecounter.repository.DailyIntakeRepository;
import com.carrascojon.caloriecounter.service.DailyIntakeService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DailyIntakeServiceImpl implements DailyIntakeService {

    private final DailyIntakeRepository dailyIntakeRepository;

    @Override
    public Optional<DailyIntake> getDailyIntakeById(Long id) {
        return dailyIntakeRepository.findById(id);
    }

    @Override
    public Iterable<DailyIntake> getAllDailyIntakes() {
        for(DailyIntake DI: dailyIntakeRepository.findAll()){
            System.out.println(DI);

        }

        return dailyIntakeRepository.findAll();
    }

    @Override
    public List<DailyIntake> findDailyIntakeByUser(User user) {
        return dailyIntakeRepository.findByUser(user);
    }

    public DailyIntake patchDailyIntake(Long id, DailyIntakeDTO dailyIntakeDTO){
        DailyIntake existingDailyIntake = dailyIntakeRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Daily Intake Not Found"));

        if(dailyIntakeDTO.getTotalCarbs() != null){
            existingDailyIntake.setTotalCarbs(dailyIntakeDTO.getTotalCarbs());
        }
        if(dailyIntakeDTO.getTotalCalories() != null){
            existingDailyIntake.setTotalCalories(dailyIntakeDTO.getTotalCalories());
        }
        if(dailyIntakeDTO.getTotalProtein() != null){
            existingDailyIntake.setTotalCalories(dailyIntakeDTO.getTotalCalories());

        }

        return dailyIntakeRepository.save(existingDailyIntake);
    }

    public DailyIntake createDailyIntake(User user, DailyIntake dailyIntake) {
        dailyIntake.setUser(user); // Associate the daily intake with the user
        return dailyIntakeRepository.save(dailyIntake);
    }

    @Override
    public DailyIntake saveDailyIntake(DailyIntake dailyIntake) {
        return dailyIntakeRepository.save(dailyIntake);
    }

    @Override
    public void deleteIntakeById(Long id) {
        dailyIntakeRepository.deleteById(id);
    }

    @Override
    public void deleteDailyIntake(DailyIntake dailyIntake) {
        dailyIntakeRepository.delete(dailyIntake);
    }
}
