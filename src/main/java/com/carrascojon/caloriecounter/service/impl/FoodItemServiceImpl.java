package com.carrascojon.caloriecounter.service.impl;


import com.carrascojon.caloriecounter.model.FoodItem;
import com.carrascojon.caloriecounter.repository.FoodItemRepository;
import com.carrascojon.caloriecounter.service.FoodItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FoodItemServiceImpl implements FoodItemService {

    private final FoodItemRepository foodItemRepository;

    private FoodItem saveFoodItem(FoodItem foodItem){
        return foodItemRepository.save(foodItem);
    }

}
