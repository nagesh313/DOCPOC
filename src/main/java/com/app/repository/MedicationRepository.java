package com.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.app.model.TbMedication;

public interface MedicationRepository extends CrudRepository<TbMedication, Integer> {
	
	

}
