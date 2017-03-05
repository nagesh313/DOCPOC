package com.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.app.model.TbAppointmentSlot;

public interface AppointmentSlotRepository extends CrudRepository<TbAppointmentSlot, Integer> {
}
