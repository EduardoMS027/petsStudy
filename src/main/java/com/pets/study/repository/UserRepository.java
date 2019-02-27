package com.pets.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pets.study.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}