package com.pets.study.controllers;


import com.pets.study.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @RequestMapping("/user")  //mapeado para /user, quando bater neste mapeamento será acionado este método
    public String getUsers(Model model){
        model.addAttribute("usersList", this.userRepository.findAll());
        return "user";
    }
}
