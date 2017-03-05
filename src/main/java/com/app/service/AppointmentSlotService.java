package com.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.TbAppointmentSlot;
import com.app.repository.AppointmentSlotRepository;

@Service
public class AppointmentSlotService {
	@Autowired 
	private AppointmentSlotRepository appointmentSlotRepository;
	
	public List<TbAppointmentSlot> getAllAppointmentSlots(){
		List<TbAppointmentSlot> appointmentSlots=new ArrayList<TbAppointmentSlot>();
		appointmentSlotRepository.findAll().forEach(appointmentSlots::add);
		return appointmentSlots;
	}
	public TbAppointmentSlot getAppointmentSlot(Integer appointmentSlotId) {
		return appointmentSlotRepository.findOne(appointmentSlotId);
	}
	public void addAppointmentSlot(TbAppointmentSlot appointmentSlot) {
		appointmentSlotRepository.save(appointmentSlot);
	}
	public void updateAppointmentSlot(TbAppointmentSlot appointmentSlot) {
		appointmentSlotRepository.save(appointmentSlot);
	}
	public void deleteAppointmentSlot(Integer appointmentSlotId) {
		appointmentSlotRepository.delete(appointmentSlotId);
	}

}
