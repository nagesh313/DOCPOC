package com.app.controller;


import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.app.model.TbPatient;
import com.app.model.PatientPayload;
import com.app.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {
	@Autowired
	PatientService ps;
	/*@RequestMapping("/hello")
	public String hello(){
		return "index";
	}*/
	@RequestMapping("/all")
	public List<TbPatient> getAllPaitents(){
		return ps.getAllPatients();
	}
	@RequestMapping("/get/{id}")
	public TbPatient getPatient(@PathVariable("id") int id){
		return ps.getPatient(id);
	}
	@CrossOrigin
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public void addPatient(@RequestBody TbPatient patient){
		ps.addPatient(patient);
		System.out.println("asdfasdssaaaaa");
		
	}
	@RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
	public void updatePatient(@PathVariable Integer patientId, @RequestBody TbPatient newPatient){
		ps.updatePatient(newPatient);
	}
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void deletePatient(@PathVariable Integer id){
		ps.deletePatient(id);
	}
}
