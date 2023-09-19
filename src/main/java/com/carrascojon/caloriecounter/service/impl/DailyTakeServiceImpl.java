package com.carrascojon.caloriecounter.service.impl;

import com.carrascojon.caloriecounter.repository.DailyIntakeRepository;
import com.carrascojon.caloriecounter.service.DailyTakeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DailyTakeServiceImpl implements DailyTakeService {

    private final DailyIntakeRepository dailyIntakeRepository;


}
