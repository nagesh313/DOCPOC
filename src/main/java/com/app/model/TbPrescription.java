package com.app.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;


/**
 * The persistent class for the tb_prescription database table.
 * 
 */
@Entity
@Table(name="tb_prescription")
@NamedQuery(name="TbPrescription.findAll", query="SELECT t FROM TbPrescription t")
public class TbPrescription implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="pre_id")
	private int preId;

	private byte active;

	private String comments;

	private String observation;
	@Transient
	private boolean email;
	@Transient
	private boolean sms;

	public boolean isEmail() {
		return email;
	}

	public void setEmail(boolean email) {
		this.email = email;
	}

	public boolean isSms() {
		return sms;
	}

	public void setSms(boolean sms) {
		this.sms = sms;
	}

	@Column(name="pat_id")
	private int patId;

	@Column(name="prescription_date")
	private Timestamp prescriptionDate;

	public TbPrescription() {
	}

	public int getPreId() {
		return this.preId;
	}

	public void setPreId(int preId) {
		this.preId = preId;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getObservation() {
		return this.observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public int getPatId() {
		return this.patId;
	}

	public void setPatId(int patId) {
		this.patId = patId;
	}

	public Timestamp getPrescriptionDate() {
		return this.prescriptionDate;
	}

	public void setPrescriptionDate(Timestamp prescriptionDate) {
		this.prescriptionDate = prescriptionDate;
	}

}