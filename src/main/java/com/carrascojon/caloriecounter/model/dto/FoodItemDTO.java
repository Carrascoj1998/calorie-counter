package com.carrascojon.caloriecounter.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FoodItemDTO {

    private String itemName;
    private Integer calories;
    private Integer carbs;
    private Integer protein;
}
