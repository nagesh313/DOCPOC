package com.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.app.model.TbPayment;

public interface PaymentRepository extends CrudRepository<TbPayment, Integer> {
	
	

}
