package com.carrascojon.caloriecounter.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "food_item")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FoodItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String itemName;
    private Integer calories;
    private Integer carbs;
    private Integer protein;

    public FoodItem(String itemName, Integer calories, Integer carbs, Integer protein) {
        this.itemName = itemName;
        this.calories = calories;
        this.carbs = carbs;
        this.protein = protein;
    }
}
