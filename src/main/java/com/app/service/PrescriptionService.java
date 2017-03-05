package com.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.TbPrescription;
import com.app.repository.PrescriptionRepository;

@Service
public class PrescriptionService {
	@Autowired 
	private PrescriptionRepository prescriptionRepository;
	
	public List<TbPrescription> getAllPrescriptions(){
		List<TbPrescription> prescriptions=new ArrayList<TbPrescription>();
		prescriptionRepository.findAll().forEach(prescriptions::add);
		return prescriptions;
	}
	public TbPrescription getPrescription(Integer prescriptionId) {
		return prescriptionRepository.findOne(prescriptionId);
	}
	public List<TbPrescription> getPrescriptionByPatientId(Integer patientId) {
		return prescriptionRepository.findBypatId(patientId);
	}
	public void addPrescription(TbPrescription prescription) {
		prescriptionRepository.save(prescription);
	}
	public void updatePrescription(TbPrescription prescription) {
		prescriptionRepository.save(prescription);
	}
	public void deletePrescription(Integer prescriptionId) {
		prescriptionRepository.delete(prescriptionId);
	}

}
