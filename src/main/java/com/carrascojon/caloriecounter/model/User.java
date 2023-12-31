package com.carrascojon.caloriecounter.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table( name = "user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String age;
    private double weight;
    private double height;
    private double targetWeight;

    public User(String name, String age, double weight, double height, double targetWeight){
        this.name = name;
        this.age  = age;
        this.weight = weight;
        this.height= height;
        this.targetWeight = targetWeight;
    }



}
