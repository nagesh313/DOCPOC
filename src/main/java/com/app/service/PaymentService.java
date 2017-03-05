package com.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.TbPayment;
import com.app.repository.PaymentRepository;


@Service
public class PaymentService  {
	@Autowired 
	private PaymentRepository paymentRepository;
	
	public List<TbPayment> getAllPayments(){
		List<TbPayment> payments=new ArrayList<TbPayment>();
		paymentRepository.findAll().forEach(payments::add);
		return payments;
	}
	public TbPayment getPayment(Integer paymentId) {
		return paymentRepository.findOne(paymentId);
	}
	public void addPayment(TbPayment payment) {
		paymentRepository.save(payment);
	}
	public void updatePayment(TbPayment payment) {
		paymentRepository.save(payment);
	}
	public void deletePayment(Integer paymentId) {
		paymentRepository.delete(paymentId);
	}
	
}
