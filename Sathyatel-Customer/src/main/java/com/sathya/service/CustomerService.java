package com.sathya.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.dto.CustomerDTO;
import com.sathya.entity.Customer;
import com.sathya.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private  CustomerRepository  repo;
	
	public  String  saveCustomer(Customer  customer) {
		repo.saveAndFlush(customer);
		return  "customer is saved";
	}
	
	public  CustomerDTO   getCustomerByPhoneNo(Long  phoneNo) {
		Optional<Customer>  opt = repo.findById(phoneNo);
		Customer  customer =opt.get();
		CustomerDTO  dto =new  CustomerDTO();
		dto.setPhoneNo(customer.getPhoneNo());
		dto.setName(customer.getName());
		dto.setAge(customer.getAge());
		dto.setPlanId(customer.getPlanId());
		return dto;
	}
}
