package com.app.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.TbAppointmentSlot;
import com.app.service.AppointmentSlotService;

@RestController
@RequestMapping("/appointmentSlot")
public class AppointmentSlotController {
	
	@Autowired
	AppointmentSlotService ps;
	/*@RequestMapping("/hello")
	public String hello(){
		return "index";
	}*/
	@RequestMapping("/all")
	public List<TbAppointmentSlot> getAllPaitents(){
		return ps.getAllAppointmentSlots();
	}
	@RequestMapping("/get/{id}")
	public TbAppointmentSlot getAppointmentSlot(@PathVariable("id") int id){
		return ps.getAppointmentSlot(id);
	}
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public void addAppointmentSlot(@RequestBody TbAppointmentSlot newAppointmentSlot){
		ps.addAppointmentSlot(newAppointmentSlot);
	}
	@RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
	public void updateAppointmentSlot(@PathVariable Integer appointmentSlotId, @RequestBody TbAppointmentSlot newAppointmentSlot){
		ps.updateAppointmentSlot(newAppointmentSlot);
	}
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void deleteAppointmentSlot(@PathVariable Integer id){
		ps.deleteAppointmentSlot(id);
	}
}
