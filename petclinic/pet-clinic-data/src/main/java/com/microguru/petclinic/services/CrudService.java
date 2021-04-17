package com.microguru.petclinic.services;

import java.util.Set;

import com.microguru.petclinic.model.Owner;

public interface CrudService<T, ID> {

	Set<T> findAll();
	
	T findById(ID id);
	
	T save(T object);
	
	void delete (T object);
	
	void deleteById(ID id);

}
