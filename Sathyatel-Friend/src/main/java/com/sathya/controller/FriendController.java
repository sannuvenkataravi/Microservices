package com.sathya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.service.FriendService;

@RestController
public class FriendController {
@Autowired
private FriendService service;
@GetMapping(value="/friend/{phoneNo}",produces="application/json")
public List<Long> getFriendDetails(@PathVariable Long phoneNo)
{
return service.getFriends(phoneNo);	
}
}
