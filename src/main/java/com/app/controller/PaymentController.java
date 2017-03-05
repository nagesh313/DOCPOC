package com.app.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.TbPayment;
import com.app.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	PaymentService ps;
	/*@RequestMapping("/hello")
	public String hello(){
		return "index";
	}*/
	@RequestMapping("/all")
	public List<TbPayment> getAllPaitents(){
		return ps.getAllPayments();
	}
	@RequestMapping("/get/{id}")
	public TbPayment getPayment(@PathVariable("id") int id){
		return ps.getPayment(id);
	}
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public void addPayment(@RequestBody TbPayment newPayment){
		ps.addPayment(newPayment);
	}
	@RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
	public void updatePayment(@PathVariable Integer paymentId, @RequestBody TbPayment newPayment){
		ps.updatePayment(newPayment);
	}
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void deletePayment(@PathVariable Integer id){
		ps.deletePayment(id);
	}
}
