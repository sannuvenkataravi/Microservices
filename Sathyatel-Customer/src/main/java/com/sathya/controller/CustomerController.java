package com.sathya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sathya.dto.CustomerDTO;
import com.sathya.dto.PlanDTO;
import com.sathya.entity.Customer;
import com.sathya.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private  RestTemplate  restTemplate;
	
	@Autowired 
	private  CustomerService  service;
	
	@PostMapping(value="/saveCustomer", consumes="application/json")
	public  String  saveCustomer(@RequestBody Customer  customer) {
		return  service.saveCustomer(customer);
	}
	
	@GetMapping(value="/viewProfile/{phoneNo}",  produces="application/json")
	public  CustomerDTO   viewProfile(@PathVariable Long phoneNo) {
		CustomerDTO  dto = service.getCustomerByPhoneNo(phoneNo);
		//calling  sathyatel-plan  microservice
		PlanDTO  planDto = restTemplate.getForObject("http://localhost:4646/Microservices/plans/"+dto.getPlanId(), PlanDTO.class);
		dto.setCurrentPlan(planDto);
		//calling  sathyatel-friend microservice
		List<Long>  friendsList = restTemplate.getForObject("http://localhost:4343/Microservices/friend/"+dto.getPhoneNo(), List.class);
		dto.setFriends(friendsList);
		return  dto;
	}
	
}
