package com.carrascojon.caloriecounter.repository;

import com.carrascojon.caloriecounter.model.HistoricalEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoricalEntryRepository extends JpaRepository<HistoricalEntry, Long> {
}
