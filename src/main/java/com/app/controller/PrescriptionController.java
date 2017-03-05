package com.app.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.TbPrescription;
import com.app.service.PrescriptionService;

@RestController
@RequestMapping("/prescription")
public class PrescriptionController {
	
	@Autowired
	PrescriptionService ps;
	/*@RequestMapping("/hello")
	public String hello(){
		return "index";
	}*/
	@RequestMapping("/all")
	public List<TbPrescription> getAllPaitents(){
		return ps.getAllPrescriptions();
	}
	@RequestMapping("/getPatientPrescription/{id}")
	public List<TbPrescription> getPrescriptionByPatientId(@PathVariable("id") int patientId){
		return ps.getPrescriptionByPatientId(patientId);
	}
	@RequestMapping("/get/{id}")
	public TbPrescription getPrescription(@PathVariable("id") int id){
		return ps.getPrescription(id);
	}
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public void addPrescription(@RequestBody TbPrescription newPrescription){
		ps.addPrescription(newPrescription);
	}
	@RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
	public void updatePrescription(@PathVariable Integer prescriptionId, @RequestBody TbPrescription newPrescription){
		ps.updatePrescription(newPrescription);
	}
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void deletePrescription(@PathVariable Integer id){
		ps.deletePrescription(id);
	}
}
