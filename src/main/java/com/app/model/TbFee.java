package com.app.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the tb_fees database table.
 * 
 */
@Entity
@Table(name="tb_fees")
@NamedQuery(name="TbFee.findAll", query="SELECT t FROM TbFee t")
public class TbFee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="fees_id")
	private int feesId;

	private int amount;

	@Column(name="charge_date")
	private Timestamp chargeDate;

	@Column(name="fees_type")
	private String feesType;

	@Column(name="is_active")
	private byte isActive;

	@Column(name="pat_id")
	private int patId;

	public TbFee() {
	}

	public int getFeesId() {
		return this.feesId;
	}

	public void setFeesId(int feesId) {
		this.feesId = feesId;
	}

	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Timestamp getChargeDate() {
		return this.chargeDate;
	}

	public void setChargeDate(Timestamp chargeDate) {
		this.chargeDate = chargeDate;
	}

	public String getFeesType() {
		return this.feesType;
	}

	public void setFeesType(String feesType) {
		this.feesType = feesType;
	}

	public byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}

	public int getPatId() {
		return this.patId;
	}

	public void setPatId(int patId) {
		this.patId = patId;
	}

}