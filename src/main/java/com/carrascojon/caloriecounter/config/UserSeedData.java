package com.carrascojon.caloriecounter.config;

import com.carrascojon.caloriecounter.model.User;
import com.carrascojon.caloriecounter.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserSeedData implements CommandLineRunner {

    private final UserRepository userRepository;

    /*
    private String name;
    private String age;
    private double weight;
    private double height;
    private double targetWeight;

     */


    @Override
    public void run(String... args) throws Exception {

        User user1 = new User("Jonathan Carrasco", "25",260, 5.11, 220);
        User user2 = new User("Elia Carrasco", "24",200, 5.4, 180);

        userRepository.save(user1);
        userRepository.save(user2);

    }
}
