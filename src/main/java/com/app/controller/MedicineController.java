package com.app.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.TbMedicine;
import com.app.service.MedicineService;

@RestController
@RequestMapping("/medicine")
public class MedicineController {
	
	@Autowired
	MedicineService ps;
	/*@RequestMapping("/hello")
	public String hello(){
		return "index";
	}*/
	@RequestMapping("/all")
	public List<TbMedicine> getAllPaitents(){
		return ps.getAllMedicines();
	}
	@RequestMapping("/get/{id}")
	public TbMedicine getMedicine(@PathVariable("id") int id){
		return ps.getMedicine(id);
	}
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public void addMedicine(@RequestBody TbMedicine newMedicine){
		ps.addMedicine(newMedicine);
	}
	@RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
	public void updateMedicine(@PathVariable Integer medicineId, @RequestBody TbMedicine newMedicine){
		ps.updateMedicine(newMedicine);
	}
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void deleteMedicine(@PathVariable Integer id){
		ps.deleteMedicine(id);
	}
}
