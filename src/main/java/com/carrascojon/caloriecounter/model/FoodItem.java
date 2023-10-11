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
    private double calories;
    private double carbs;
    private double protein;

    public FoodItem(String itemName, double calories, double carbs, double protein) {
        this.itemName = itemName;
        this.calories = calories;
        this.carbs = carbs;
        this.protein = protein;
    }
}
