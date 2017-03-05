package com.app.model;

import java.io.Serializable;
import java.sql.Timestamp;
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

import org.springframework.web.multipart.MultipartFile;


/**
 * The persistent class for the tb_patient database table.
 * 
 */
@Entity
@Table(name="tb_patient")
@NamedQuery(name="TbPatient.findAll", query="SELECT t FROM TbPatient t")
public class TbPatient implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="pat_id")
	private int patId;

	private String blood_Group;

	@Temporal(TemporalType.DATE)
	private Date dob;

	private String email;

	private String father_Name;

	private String first_Name;

	private String gender;

	@Column(name="is_active")
	private String isActive;

	private String last_Name;

	private String middle_Name;

	private byte[] photo;

	@Column(name="primary_mobile")
	private long primaryMobile;

	@Column(name="registration_date")
	private Timestamp registrationDate;

	@Column(name="secodary_mobile")
	private long secodaryMobile;

	public TbPatient() {
	}

	public int getPatId() {
		return this.patId;
	}

	public void setPatId(int patId) {
		this.patId = patId;
	}

	public String getBlood_Group() {
		return this.blood_Group;
	}

	public void setBlood_Group(String blood_Group) {
		this.blood_Group = blood_Group;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFather_Name() {
		return this.father_Name;
	}

	public void setFather_Name(String father_Name) {
		this.father_Name = father_Name;
	}

	public String getFirst_Name() {
		return this.first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getLast_Name() {
		return this.last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public String getMiddle_Name() {
		return this.middle_Name;
	}

	public void setMiddle_Name(String middle_Name) {
		this.middle_Name = middle_Name;
	}

	public byte[] getPhoto() {
		return this.photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public long getPrimaryMobile() {
		return this.primaryMobile;
	}

	public void setPrimaryMobile(long primaryMobile) {
		this.primaryMobile = primaryMobile;
	}

	public Timestamp getRegistrationDate() {
		return this.registrationDate;
	}

	public void setRegistrationDate(Timestamp registrationDate) {
		this.registrationDate = registrationDate;
	}

	public long getSecodaryMobile() {
		return this.secodaryMobile;
	}

	public void setSecodaryMobile(long secodaryMobile) {
		this.secodaryMobile = secodaryMobile;
	}

}