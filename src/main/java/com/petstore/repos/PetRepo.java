package com.petstore.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petstore.entities.Pet;

public interface PetRepo extends JpaRepository<Pet, Long>{

}
