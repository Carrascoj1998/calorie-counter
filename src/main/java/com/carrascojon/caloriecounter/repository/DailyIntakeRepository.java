package com.carrascojon.caloriecounter.repository;

import com.carrascojon.caloriecounter.model.DailyIntake;
import com.carrascojon.caloriecounter.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DailyIntakeRepository extends JpaRepository<DailyIntake, Long> {

    List<DailyIntake> findByUser(User user);


}
