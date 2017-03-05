package com.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.TbFee;
import com.app.repository.FeeRepository;

@Service
public class FeeService {
	@Autowired 
	private FeeRepository feeRepository;
	
	public List<TbFee> getAllFees(){
		List<TbFee> fees=new ArrayList<TbFee>();
		feeRepository.findAll().forEach(fees::add);
		return fees;
	}
	public TbFee getFee(Integer feeId) {
		return feeRepository.findOne(feeId);
	}
	public void addFee(TbFee fee) {
		feeRepository.save(fee);
	}
	public void updateFee(TbFee fee) {
		feeRepository.save(fee);
	}
	public void deleteFee(Integer feeId) {
		feeRepository.delete(feeId);
	}

}
