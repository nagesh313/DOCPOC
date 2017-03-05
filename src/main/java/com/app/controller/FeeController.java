package com.app.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.TbFee;
import com.app.service.FeeService;

@RestController
@RequestMapping("/fee")
public class FeeController {
	
	@Autowired
	FeeService ps;
	/*@RequestMapping("/hello")
	public String hello(){
		return "index";
	}*/
	@RequestMapping("/all")
	public List<TbFee> getAllPaitents(){
		return ps.getAllFees();
	}
	@RequestMapping("/get/{id}")
	public TbFee getFee(@PathVariable("id") int id){
		return ps.getFee(id);
	}
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public void addFee(@RequestBody TbFee newFee){
		ps.addFee(newFee);
	}
	@RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
	public void updateFee(@PathVariable Integer feeId, @RequestBody TbFee newFee){
		ps.updateFee(newFee);
	}
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void deleteFee(@PathVariable Integer id){
		ps.deleteFee(id);
	}
}
