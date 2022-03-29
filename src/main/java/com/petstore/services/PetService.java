package com.petstore.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.petstore.entities.Pet;

@Service
public interface PetService {

	Pet savePet(Pet pet);

	List<Pet> getPets();


	Pet getPetById(Long id);

}
