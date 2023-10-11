package com.carrascojon.caloriecounter.controller;


import com.carrascojon.caloriecounter.model.FoodItem;
import com.carrascojon.caloriecounter.model.dto.FoodItemDTO;
import com.carrascojon.caloriecounter.service.impl.FoodItemServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/foodItem")
@RequiredArgsConstructor
public class FoodItemController {

    private final FoodItemServiceImpl foodItemService;

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Optional<FoodItem> getFoodItemById(@PathVariable Long id){
        return foodItemService.getFoodItemById(id);
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Iterable<FoodItem> getAllFoodItems(){
        return foodItemService.getAllFoodItems();
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Optional<FoodItem> saveFoodItem(@RequestBody FoodItem foodItem){
        return Optional.ofNullable(foodItemService.saveFoodItem(foodItem));
    }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void patchFoodItem(@PathVariable Long id, @RequestBody FoodItemDTO foodItemDTO){
        foodItemService.patchFoodItem(id, foodItemDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteFoodItemById(@PathVariable Long id){
        foodItemService.deleteFoodItemById(id);
    }

    @DeleteMapping("/{itemName}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteFoodItemByName(@PathVariable String itemName,
                                     @RequestParam(name = "byName", required = false) String byName){
        foodItemService.deleteFoodItemByName(itemName);
    }

}
