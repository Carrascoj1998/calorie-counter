package com.carrascojon.caloriecounter.repository;

import com.carrascojon.caloriecounter.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {

    Optional<FoodItem> findByItemName(String itemName);
    void deleteByItemName(String itemName);
}
