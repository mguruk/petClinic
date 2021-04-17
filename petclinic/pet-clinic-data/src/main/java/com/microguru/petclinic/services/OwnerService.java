package com.microguru.petclinic.services;

import com.microguru.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {
	
	Owner findByLastName(String lastName);

}
