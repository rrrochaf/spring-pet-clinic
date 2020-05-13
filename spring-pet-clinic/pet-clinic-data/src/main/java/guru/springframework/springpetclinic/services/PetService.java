package guru.springframework.springpetclinic.services;

import java.util.Set;

import guru.springframework.springpetclinic.model.Pet;

public interface PetService {
	
	Pet findById(Long id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();

}
