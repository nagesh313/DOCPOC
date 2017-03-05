package com.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.app.model.TbPrescription;

public interface PrescriptionRepository extends CrudRepository<TbPrescription, Integer> {
	public List<TbPrescription> findBypatId(Integer patId);
}

