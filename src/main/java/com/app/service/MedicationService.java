package com.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.TbMedication;
import com.app.repository.MedicationRepository;


@Service
public class MedicationService  {
	@Autowired 
	private MedicationRepository medicationRepository;
	
	public List<TbMedication> getAllMedications(){
		List<TbMedication> medications=new ArrayList<TbMedication>();
		medicationRepository.findAll().forEach(medications::add);
		return medications;
	}
	public TbMedication getMedication(Integer medicationId) {
		return medicationRepository.findOne(medicationId);
	}
	public void addMedication(TbMedication medication) {
		medicationRepository.save(medication);
	}
	public void updateMedication(TbMedication medication) {
		medicationRepository.save(medication);
	}
	public void deleteMedication(Integer medicationId) {
		medicationRepository.delete(medicationId);
	}
	
}
