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
 * The persistent class for the tb_medicine database table.
 * 
 */
@Entity
@Table(name="tb_medicine")
@NamedQuery(name="TbMedicine.findAll", query="SELECT t FROM TbMedicine t")
public class TbMedicine implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="med_id")
	private int medId;

	private byte active;

	@Column(name="chemical_com")
	private String chemicalCom;

	private String company;

	@Column(name="med_name")
	private String medName;

	public TbMedicine() {
	}

	public int getMedId() {
		return this.medId;
	}

	public void setMedId(int medId) {
		this.medId = medId;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public String getChemicalCom() {
		return this.chemicalCom;
	}

	public void setChemicalCom(String chemicalCom) {
		this.chemicalCom = chemicalCom;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getMedName() {
		return this.medName;
	}

	public void setMedName(String medName) {
		this.medName = medName;
	}

}