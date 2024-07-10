package com.pruebajpa.my_crud.controller;

import com.pruebajpa.my_crud.model.UserModel;
import com.pruebajpa.my_crud.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public ArrayList<UserModel> getUsers(){
        return  this.userService.getUser();
    }

    @PostMapping
    public UserModel saveUser (@RequestBody UserModel user){
        return this.userService.saveUser(user);
    }

    @GetMapping(path = "/{id}")
    public Optional<UserModel> getUserById(@PathVariable("id") Long id){
        return this.userService.getById(id);
    }

    @PutMapping
    public UserModel updateUserById(@RequestBody UserModel request, Long id){
        return this.userService.updateById(request,id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.userService.deleteUser(id);
        if(ok){
            return "User with that id deleted succesfully";
        }
        else{
            return  "Error, we have a problem to delete user with that id";
        }
    }

}
