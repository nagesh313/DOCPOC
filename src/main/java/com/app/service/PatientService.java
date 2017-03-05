package com.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.TbPatient;
import com.app.repository.PatientRepository;


@Service
public class PatientService  {
	@Autowired 
	private PatientRepository patientRepository;
	
	public List<TbPatient> getAllPatients(){
		List<TbPatient> patients=new ArrayList<TbPatient>();
		patientRepository.findAll().forEach(patients::add);
		return patients;
	}
	public TbPatient getPatient(Integer patientId) {
		return patientRepository.findOne(patientId);
	}
	public void addPatient(TbPatient patient) {
		patientRepository.save(patient);
	}
	public void updatePatient(TbPatient patient) {
		patientRepository.save(patient);
	}
	public void deletePatient(Integer patientId) {
		patientRepository.delete(patientId);
	}
	
}
