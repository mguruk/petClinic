package com.microguru.petclinic.services;

import java.util.Set;

import com.microguru.petclinic.model.Owner;

public interface OwnerService {
	
	Owner findByLastName(String lastName);
	
	Set<Owner> findAll();
	
	Owner save(Owner owner);
	
	Owner findById(Long id);
}
