package com.carrascojon.caloriecounter.controller;

import com.carrascojon.caloriecounter.model.User;
import com.carrascojon.caloriecounter.model.dto.UserDTO;
import com.carrascojon.caloriecounter.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserServiceImpl userService;



    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Optional<User> getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Iterable<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Optional<User> saveUser(@RequestBody User user){
        return Optional.ofNullable(userService.saveUser(user));
    }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void patchUser(@PathVariable Long id, @RequestBody UserDTO userDTO){
        userService.patchUser(id, userDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteUserById(@PathVariable Long id){
        userService.deleteUserById(id);
    }




}
