package com.carrascojon.caloriecounter.repository;

import com.carrascojon.caloriecounter.model.DailyIntake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DailyIntakeRepository extends JpaRepository<DailyIntake, Long> {
}
