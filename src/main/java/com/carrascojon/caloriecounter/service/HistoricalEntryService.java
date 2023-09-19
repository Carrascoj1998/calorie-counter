package com.carrascojon.caloriecounter.service;

import com.carrascojon.caloriecounter.model.HistoricalEntry;
import com.carrascojon.caloriecounter.model.User;

import java.util.List;

public interface HistoricalEntryService {

    List<HistoricalEntry> findByUser(User user);
}
