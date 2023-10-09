package com.carrascojon.caloriecounter.service;


import com.carrascojon.caloriecounter.model.User;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public interface UserService {

    Optional<User> getUserById(Long id);

    Iterable<User> getAllUsers();

    Optional<User> getUserByName(String name);

    User updateUser(User user);

    User saveUser(User user);

    void deleteUserById(Long id);

    void deleteUser(User user);

}
