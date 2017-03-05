package com.app.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.TbMedication;
import com.app.service.MedicationService;

@RestController
@RequestMapping("/medication")
public class MedicationController {
	
	@Autowired
	MedicationService ps;
	/*@RequestMapping("/hello")
	public String hello(){
		return "index";
	}*/
	@RequestMapping("/all")
	public List<TbMedication> getAllPaitents(){
		return ps.getAllMedications();
	}
	@RequestMapping("/get/{id}")
	public TbMedication getMedication(@PathVariable("id") int id){
		return ps.getMedication(id);
	}
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public void addMedication(@RequestBody TbMedication newMedication){
		ps.addMedication(newMedication);
	}
	@RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
	public void updateMedication(@PathVariable Integer medicationId, @RequestBody TbMedication newMedication){
		ps.updateMedication(newMedication);
	}
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void deleteMedication(@PathVariable Integer id){
		ps.deleteMedication(id);
	}
}
