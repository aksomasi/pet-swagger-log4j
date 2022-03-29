package com.petstore;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.petstore.embededs.Category;
import com.petstore.entities.Pet;
import com.petstore.repos.PetRepo;
import com.petstore.serviceimpls.PetServiceImpl;

@SpringBootTest
public class PetServiceImplTest {

	@InjectMocks
	PetServiceImpl petServiceImpl;

	@Mock
	PetRepo petRepo;

	@Test
	public void savePet() throws Exception {
		Pet pet = new Pet();
		Category category = new Category();
		category.setName("Breed1");
		category.setType("Type1");
		pet.setName("Puppy");
		pet.setCategory(category);
		Pet response = new Pet();
		response = pet;
		Pet entity = petServiceImpl.savePet(pet);
		when(petRepo.save(pet)).thenReturn(response);
		assertEquals(pet, response);
	}

	@Test
	public void getPets() throws Exception {
		Pet pet = new Pet();
		Category category = new Category();
		category.setName("Breed1");
		category.setType("Type1");
		pet.setName("Puppy");
		pet.setCategory(category);
		List<Pet> list = new ArrayList<Pet>();
		list.add(pet);
		List<Pet> response = new ArrayList<Pet>();
		response = list;
		List<Pet> entity = petServiceImpl.getPets();
		when(petRepo.findAll()).thenReturn(response);
		assertEquals(list, response);
	}

}
