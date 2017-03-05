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
 * The persistent class for the tb_medication database table.
 * 
 */
@Entity
@Table(name="tb_medication")
@NamedQuery(name="TbMedication.findAll", query="SELECT t FROM TbMedication t")
public class TbMedication implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="medic_id")
	private int medicId;

	private byte active;

	@Column(name="daily_doze")
	private String dailyDoze;

	@Column(name="daily_interval")
	private String dailyInterval;

	@Column(name="duration_in_days")
	private int durationInDays;

	@Column(name="med_id")
	private int medId;

	@Column(name="pre_id")
	private int preId;

	public TbMedication() {
	}

	public int getMedicId() {
		return this.medicId;
	}

	public void setMedicId(int medicId) {
		this.medicId = medicId;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public String getDailyDoze() {
		return this.dailyDoze;
	}

	public void setDailyDoze(String dailyDoze) {
		this.dailyDoze = dailyDoze;
	}

	public String getDailyInterval() {
		return this.dailyInterval;
	}

	public void setDailyInterval(String dailyInterval) {
		this.dailyInterval = dailyInterval;
	}

	public int getDurationInDays() {
		return this.durationInDays;
	}

	public void setDurationInDays(int durationInDays) {
		this.durationInDays = durationInDays;
	}

	public int getMedId() {
		return this.medId;
	}

	public void setMedId(int medId) {
		this.medId = medId;
	}

	public int getPreId() {
		return this.preId;
	}

	public void setPreId(int preId) {
		this.preId = preId;
	}

}