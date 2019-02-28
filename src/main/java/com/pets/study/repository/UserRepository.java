package com.pets.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.pets.study.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

    User findByName(String name); //Coloca findBy"NomeDaColuna" o Spring Boot irá procurar exatamente o nome desta coluna
    //Exemplo de Query deste tipo seria
    //SELECT * FROM dbpetstudy2.user WHERE name = "Eduardo Marques da Silva"

   /* @Query("SELECT u FROM User u WHERE u.name LIKE %?l")
    User findByNameQualquerCoisa(String name);*/


}