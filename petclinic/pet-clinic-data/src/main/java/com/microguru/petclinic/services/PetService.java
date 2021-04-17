package com.microguru.petclinic.services;

import java.util.Set;
import com.microguru.petclinic.model.Pet;

public interface PetService extends CrudService<Pet, Long> {
	
	Pet findById(Long id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();
}
