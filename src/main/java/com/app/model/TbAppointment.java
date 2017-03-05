package com.app.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the tb_appointment database table.
 * 
 */
@Entity
@Table(name="tb_appointment")
@NamedQuery(name="TbAppointment.findAll", query="SELECT t FROM TbAppointment t")
public class TbAppointment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="app_id")
	private int appId;

	private byte active;

	@Temporal(TemporalType.DATE)
	@Column(name="appointment_date")
	private Date appointmentDate;

	@Column(name="pat_id")
	private int patId;

	@Column(name="slot_id")
	private int slotId;

	private String status;

	public TbAppointment() {
	}

	public int getAppId() {
		return this.appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public Date getAppointmentDate() {
		return this.appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public int getPatId() {
		return this.patId;
	}

	public void setPatId(int patId) {
		this.patId = patId;
	}

	public int getSlotId() {
		return this.slotId;
	}

	public void setSlotId(int slotId) {
		this.slotId = slotId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}