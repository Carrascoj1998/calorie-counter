package com.carrascojon.caloriecounter.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "historical_entry")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HistoricalEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;

    @ManyToOne
    private User user;

    private Integer totalCalories;
    private Integer totalCarbs;
    private Integer totalProtein;

}
