package com.pets.study.config;

import java.util.List;

import com.pets.study.entity.User;
import com.pets.study.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    UserRepository userRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent arg0){
        //System.out.println("Entrou aqui !");

        List<User> listUser = userRepository.findAll();
        
        if(listUser.isEmpty()){
            User varUser = new User();

            varUser.setEmail("eduardo@teste.com");
            varUser.setName("Eduardo Marques da Silva");
    
            userRepository.save(varUser);
        }
    }
}