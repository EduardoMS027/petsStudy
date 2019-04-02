package com.pets.study.controllers;

import com.pets.study.repository.UserRepository;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.pets.study.entity.User;

@RestController
//@RequestMapping("/user")
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    /*@RequestMapping("/user")  //mapeado para /user, quando bater neste mapeamento será acionado este método
    public String getUsers(Model model){
        model.addAttribute("usersList", this.userRepository.findAll());
        return "user";
    }*/

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public List<User> findAll(){
        return userRepository.findAll();
    }


    @RequestMapping(value = "/user/{id}",method = RequestMethod.DELETE)
    public void findAll(@PathVariable Long id){
        userRepository.deleteById(id);
    }


    @RequestMapping(value = "/user", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public User save(@RequestBody User user){
        return userRepository.save(user);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
    public User update(@RequestBody User user){
        return userRepository.save(user);
    }
}
