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
 * The persistent class for the tb_payments database table.
 * 
 */
@Entity
@Table(name="tb_payments")
@NamedQuery(name="TbPayment.findAll", query="SELECT t FROM TbPayment t")
public class TbPayment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="pay_id")
	private int payId;

	private byte active;

	@Column(name="amount_paid")
	private int amountPaid;

	@Column(name="mod_of_payment")
	private String modOfPayment;

	@Column(name="pat_id")
	private int patId;

	@Column(name="payment_dae")
	private Timestamp paymentDae;

	@Column(name="txn_number")
	private String txnNumber;

	public TbPayment() {
	}

	public int getPayId() {
		return this.payId;
	}

	public void setPayId(int payId) {
		this.payId = payId;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public int getAmountPaid() {
		return this.amountPaid;
	}

	public void setAmountPaid(int amountPaid) {
		this.amountPaid = amountPaid;
	}

	public String getModOfPayment() {
		return this.modOfPayment;
	}

	public void setModOfPayment(String modOfPayment) {
		this.modOfPayment = modOfPayment;
	}

	public int getPatId() {
		return this.patId;
	}

	public void setPatId(int patId) {
		this.patId = patId;
	}

	public Timestamp getPaymentDae() {
		return this.paymentDae;
	}

	public void setPaymentDae(Timestamp paymentDae) {
		this.paymentDae = paymentDae;
	}

	public String getTxnNumber() {
		return this.txnNumber;
	}

	public void setTxnNumber(String txnNumber) {
		this.txnNumber = txnNumber;
	}

}