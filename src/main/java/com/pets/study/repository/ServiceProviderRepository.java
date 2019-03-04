package com.pets.study.repository;

import com.pets.study.entity.ServiceProvider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceProviderRepository {

    ServiceProvider findByName(String name);

    ServiceProvider findByEmail(String email);
}
