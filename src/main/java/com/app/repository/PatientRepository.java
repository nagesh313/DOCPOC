package com.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.app.model.TbPatient;

public interface PatientRepository extends CrudRepository<TbPatient, Integer> {
	
	

}
