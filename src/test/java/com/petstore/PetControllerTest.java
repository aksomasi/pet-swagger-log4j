package com.petstore;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.petstore.controllers.PetController;
import com.petstore.embededs.Category;
import com.petstore.entities.Pet;
import com.petstore.services.PetService;

@SpringBootTest
public class PetControllerTest {

	@InjectMocks
	PetController petController;

	@Mock
	PetService petService;
	
	@Test
	public void savePetResponseCode() throws Exception {
		Pet pet = new Pet();
		Category category = new Category();
		category.setName("Breed1");
		category.setType("Type1");
		pet.setName("Puppy");
		pet.setCategory(category);
		Pet response = new Pet();
		response = pet;
		ResponseEntity<?> entity = petController.savePet(pet);
		when(petService.savePet(pet)).thenReturn(response);
		assertEquals(200, entity.getStatusCodeValue());
	}
	
	@Test
	public void getPetResponseCode() throws Exception {
		Pet pet = new Pet();
		Category category = new Category();
		category.setName("Breed1");
		category.setType("Type1");
		pet.setName("Puppy");
		pet.setCategory(category);
		List<Pet> list = new ArrayList<Pet>();
		list.add(pet);
		List<Pet>  response =new ArrayList<Pet>();
		response = list;
		ResponseEntity<?> entity = petController.getPets();
		when(petService.getPets()).thenReturn(response);
		assertEquals(200, entity.getStatusCodeValue());
	}
	
	@Test
	public void getPetByIdResponseCode() throws Exception {
		Pet pet = new Pet();
		Category category = new Category();
		category.setName("Breed1");
		category.setType("Type1");
		pet.setName("Puppy");
		pet.setId(1L);
		pet.setCategory(category);
		Pet response = new Pet();
		response = pet;
		ResponseEntity<?> entity = petController.getPetById(1L);
		when(petService.getPetById(1L)).thenReturn(response);
		assertEquals(200, entity.getStatusCodeValue());
	}
	
}
