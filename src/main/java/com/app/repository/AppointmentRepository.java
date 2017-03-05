package com.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.app.model.TbAppointment;

public interface AppointmentRepository extends CrudRepository<TbAppointment, Integer> {
	
	

}
