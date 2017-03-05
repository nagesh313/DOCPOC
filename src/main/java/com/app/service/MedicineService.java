package com.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.TbMedicine;
import com.app.repository.MedicineRepository;


@Service
public class MedicineService  {
	@Autowired 
	private MedicineRepository medicineRepository;
	
	public List<TbMedicine> getAllMedicines(){
		List<TbMedicine> medicines=new ArrayList<TbMedicine>();
		medicineRepository.findAll().forEach(medicines::add);
		return medicines;
	}
	public TbMedicine getMedicine(Integer medicineId) {
		return medicineRepository.findOne(medicineId);
	}
	public void addMedicine(TbMedicine medicine) {
		medicineRepository.save(medicine);
	}
	public void updateMedicine(TbMedicine medicine) {
		medicineRepository.save(medicine);
	}
	public void deleteMedicine(Integer medicineId) {
		medicineRepository.delete(medicineId);
	}
	
}
