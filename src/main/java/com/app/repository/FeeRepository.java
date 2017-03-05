package com.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.app.model.TbFee;

public interface FeeRepository extends CrudRepository<TbFee, Integer> {
	
	

}
