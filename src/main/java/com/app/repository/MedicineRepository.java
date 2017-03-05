package com.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.app.model.TbMedicine;

public interface MedicineRepository extends CrudRepository<TbMedicine, Integer> {
	
	

}
