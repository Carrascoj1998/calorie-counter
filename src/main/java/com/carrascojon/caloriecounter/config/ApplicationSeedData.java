package com.carrascojon.caloriecounter.config;

import com.carrascojon.caloriecounter.model.FoodItem;
import com.carrascojon.caloriecounter.model.User;
import com.carrascojon.caloriecounter.repository.FoodItemRepository;
import com.carrascojon.caloriecounter.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ApplicationSeedData implements CommandLineRunner {

    private final UserRepository userRepository;
    private final FoodItemRepository foodItemRepository;




    @Override
    public void run(String... args) throws Exception {

        User user1 = new User("Jonathan Carrasco", "25",260, 5.11, 220);
        User user2 = new User("Elia Carrasco", "24",200, 5.4, 180);

        userRepository.save(user1);
        userRepository.save(user2);

        FoodItem foodItem1 = new FoodItem("Ham Sandwich" , 355 , 9, 25 );
        FoodItem foodItem2 = new FoodItem("Cookies", 90, 1, 5);
        FoodItem foodItem3 = new FoodItem("Yogurt", 130, 4, 2);

        foodItemRepository.save(foodItem1);
        foodItemRepository.save(foodItem2);
        foodItemRepository.save(foodItem3);


    }
}
