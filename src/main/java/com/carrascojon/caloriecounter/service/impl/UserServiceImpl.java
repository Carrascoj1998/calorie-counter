package com.carrascojon.caloriecounter.service.impl;

import com.carrascojon.caloriecounter.model.User;
import com.carrascojon.caloriecounter.model.dto.UserDTO;
import com.carrascojon.caloriecounter.repository.UserRepository;
import com.carrascojon.caloriecounter.service.UserService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id) ;
    }

    @Override
    public Iterable<User> getAllUsers() {
        for (User u: userRepository.findAll()) {
            System.out.println(u);
        }

        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUserByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    public User patchUser(Long id, UserDTO userDTO){
        User existingUser = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("User Not Found!"));

        if(userDTO.getName() != null){
            existingUser.setName(userDTO.getName());
        }
        if(userDTO.getAge() != null){
            existingUser.setAge(userDTO.getAge());
        }
        if(userDTO.getWeight() != null){
            existingUser.setWeight(userDTO.getWeight());
        }
        if(userDTO.getTargetWeight() != null){
            existingUser.setTargetWeight(userDTO.getTargetWeight());
        }

        return userRepository.save(existingUser);
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void deleteUser(User user) {
        userRepository.delete(user);
    }
}
