package com.app.model;
import java.sql.Timestamp;
import java.util.Date;
import org.springframework.web.multipart.MultipartFile;
public class PatientPayload {
    
		private int patId;
		private String blood_Group;
		private Date dob;
		private String email;
		private String father_Name;
		private String first_Name;
		private String gender;
		private byte isActive;
		private String last_Name;
		private String middle_Name;
		private MultipartFile photo;
		private int primaryMobile;
		private Timestamp registrationDate;
		private int secodaryMobile;
		public int getPatId() {
		return patId;
	}
	public void setPatId(int patId) {
		this.patId = patId;
	}
	public String getBlood_Group() {
		return blood_Group;
	}
	public void setBlood_Group(String blood_Group) {
		this.blood_Group = blood_Group;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFather_Name() {
		return father_Name;
	}
	public void setFather_Name(String father_Name) {
		this.father_Name = father_Name;
	}
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public byte getIsActive() {
		return isActive;
	}
	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public String getMiddle_Name() {
		return middle_Name;
	}
	public void setMiddle_Name(String middle_Name) {
		this.middle_Name = middle_Name;
	}
	public MultipartFile getPhoto() {
		return photo;
	}
	public void setPhoto(MultipartFile photo) {
		this.photo = photo;
	}
	public int getPrimaryMobile() {
		return primaryMobile;
	}	
	public void setPrimaryMobile(int primaryMobile) {
		this.primaryMobile = primaryMobile;
	}
	public Timestamp getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Timestamp registrationDate) {
		this.registrationDate = registrationDate;
	}
	public int getSecodaryMobile() {
		return secodaryMobile;
	}
	public void setSecodaryMobile(int secodaryMobile) {
		this.secodaryMobile = secodaryMobile;
	}

 
}