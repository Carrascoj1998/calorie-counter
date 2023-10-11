package com.carrascojon.caloriecounter.service.impl;

import com.carrascojon.caloriecounter.model.FoodItem;
import com.carrascojon.caloriecounter.model.dto.FoodItemDTO;
import com.carrascojon.caloriecounter.repository.FoodItemRepository;
import com.carrascojon.caloriecounter.service.FoodItemService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FoodItemServiceImpl implements FoodItemService {

    private final FoodItemRepository foodItemRepository;
    @Override
    public Optional<FoodItem> getFoodItemById(Long id) {
        return foodItemRepository.findById(id);
    }

    @Override
    public Iterable<FoodItem> getAllFoodItems() {
        for(FoodItem fI: foodItemRepository.findAll()){
            System.out.println(fI);
        }

        return foodItemRepository.findAll();
    }

    @Override
    public Optional<FoodItem> getFoodItemByName(String itemName) {
        return foodItemRepository.findByItemName(itemName);
    }

    @Override
    public FoodItem updateFoodItem(FoodItem foodItem) {
        return null;
    }

    public FoodItem patchFoodItem(Long id, FoodItemDTO foodItemDTO){

        FoodItem existingFoodItem = foodItemRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("FoodItem Not Found"));

        if(foodItemDTO.getItemName() != null){
            existingFoodItem.setItemName(foodItemDTO.getItemName());

        }
        if(foodItemDTO.getCalories() != null){
            existingFoodItem.setCalories(foodItemDTO.getCalories());
        }
        if (foodItemDTO.getCarbs() != null){
            existingFoodItem.setCarbs(foodItemDTO.getCarbs());
        }
        if(foodItemDTO.getProtein() != null){
            existingFoodItem.setProtein(foodItemDTO.getProtein());
        }

        return foodItemRepository.save(existingFoodItem);
    }

    @Override
    public FoodItem saveFoodItem(FoodItem foodItem) {
        return foodItemRepository.save(foodItem);
    }

    @Override
    public void deleteFoodItemById(Long id) {
        foodItemRepository.deleteById(id);
    }

    @Override
    public void deleteFoodItemByName(String itemName) {
        foodItemRepository.deleteByItemName(itemName);
    }
}
