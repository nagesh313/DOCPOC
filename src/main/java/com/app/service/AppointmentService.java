package com.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.TbAppointment;
import com.app.repository.AppointmentRepository;


@Service
public class AppointmentService  {
	@Autowired 
	private AppointmentRepository appointmentRepository;
	
	public List<TbAppointment> getAllAppointments(){
		List<TbAppointment> appointments=new ArrayList<TbAppointment>();
		appointmentRepository.findAll().forEach(appointments::add);
		return appointments;
	}
	public TbAppointment getAppointment(Integer appointmentId) {
		return appointmentRepository.findOne(appointmentId);
	}
	public void addAppointment(TbAppointment appointment) {
		appointmentRepository.save(appointment);
	}
	public void updateAppointment(TbAppointment appointment) {
		appointmentRepository.save(appointment);
	}
	public void deleteAppointment(Integer appointmentId) {
		appointmentRepository.delete(appointmentId);
	}
	
}
