package com.petstore.serviceimpls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petstore.entities.Pet;
import com.petstore.repos.PetRepo;
import com.petstore.services.PetService;

@Service
public class PetServiceImpl implements PetService {

	@Autowired
	PetRepo petRepo;

	@Override
	public Pet savePet(Pet pet) {
		return petRepo.save(pet);
	}

	@Override
	public List<Pet> getPets() {
		return petRepo.findAll();
	}

	@Override
	public Pet getPetById(Long id) {
		return petRepo.findById(id).get();
	}

}
