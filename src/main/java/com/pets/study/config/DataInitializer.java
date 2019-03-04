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
            createUser("Eduardo Marques da Silva", "e.marquesds@gmail.com");
            createUser("Milton Marques da Silva Junior", "junior@mgmdiag.com.br");
            createUser("Isabel Cristina Falcirolli Marques da Silva", "isabel@mgmdiag.com.br");
            createUser("Leticia Marques da Silva", "leticia@mgmdiag.com.br");
        }
        //User varUser = userRepository.findByName("e.marquesds@gmail.com");
    }

    public void createUser(String name, String email){
        User varUser = new User(name, email);
        userRepository.save(varUser);
    }
}