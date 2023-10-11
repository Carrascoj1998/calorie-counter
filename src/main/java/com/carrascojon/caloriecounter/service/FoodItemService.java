package com.carrascojon.caloriecounter.service;

import com.carrascojon.caloriecounter.model.FoodItem;

import java.util.Optional;

public interface FoodItemService {

    Optional<FoodItem> getFoodItemById(Long id);

    Iterable<FoodItem> getAllFoodItems();

    Optional<FoodItem> getFoodItemByName(String itemName);

    FoodItem updateFoodItem(FoodItem foodItem);

    FoodItem saveFoodItem(FoodItem foodItem);

    void deleteFoodItemById(Long id);

    void deleteFoodItemByName(String itemName);



}
