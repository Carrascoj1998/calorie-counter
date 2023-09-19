package com.carrascojon.caloriecounter.service.impl;

import com.carrascojon.caloriecounter.model.HistoricalEntry;
import com.carrascojon.caloriecounter.model.User;
import com.carrascojon.caloriecounter.service.HistoricalEntryService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HistoricalEntryServiceImpl implements HistoricalEntryService {
    @Override
    public List<HistoricalEntry> findByUser(User user) {
        return null;
    }
}
