package com.app.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.TbAppointment;
import com.app.service.AppointmentService;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
	@Autowired
	AppointmentService ps;
	/*@RequestMapping("/hello")
	public String hello(){
		return "index";
	}*/
	@RequestMapping("/all")
	public List<TbAppointment> getAllPaitents(){
		return ps.getAllAppointments();
	}
	@RequestMapping("/get/{id}")
	public TbAppointment getAppointment(@PathVariable("id") int id){
		return ps.getAppointment(id);
	}
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public void addAppointment(@RequestBody TbAppointment newAppointment){
		ps.addAppointment(newAppointment);
	}
	@RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
	public void updateAppointment(@PathVariable Integer appointmentId, @RequestBody TbAppointment newAppointment){
		ps.updateAppointment(newAppointment);
	}
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void deleteAppointment(@PathVariable Integer id){
		ps.deleteAppointment(id);
	}
}
