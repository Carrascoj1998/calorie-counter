package com.carrascojon.caloriecounter.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FoodItemDTO {

    private String itemName;
    private Double calories;
    private Double carbs;
    private Double protein;
}
