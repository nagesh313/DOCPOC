package com.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the tb_appointment_slots database table.
 * 
 */
@Entity
@Table(name="tb_appointment_slots")
@NamedQuery(name="TbAppointmentSlot.findAll", query="SELECT t FROM TbAppointmentSlot t")
public class TbAppointmentSlot implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="slot_id")
	private int slotId;

	private byte active;

	@Column(name="day_slot")
	private String daySlot;

	private int hours;

	private int minuts;

	@Column(name="week_day")
	private String weekDay;

	public TbAppointmentSlot() {
	}

	public int getSlotId() {
		return this.slotId;
	}

	public void setSlotId(int slotId) {
		this.slotId = slotId;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public String getDaySlot() {
		return this.daySlot;
	}

	public void setDaySlot(String daySlot) {
		this.daySlot = daySlot;
	}

	public int getHours() {
		return this.hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinuts() {
		return this.minuts;
	}

	public void setMinuts(int minuts) {
		this.minuts = minuts;
	}

	public String getWeekDay() {
		return this.weekDay;
	}

	public void setWeekDay(String weekDay) {
		this.weekDay = weekDay;
	}

}