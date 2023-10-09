package com.carrascojon.caloriecounter.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "daily_intake")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DailyIntake {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;

    @ManyToOne
    private User user;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "daily_intake_id")
    private List<FoodItem> consumedFoods;

    private double totalCarbs;
    private double totalCalories;
    private double totalProtein;


}
