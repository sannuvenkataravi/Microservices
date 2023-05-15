package com.sathya.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.entity.Friend;
import com.sathya.repository.FriendRepository;

@Service
public class FriendService {
@Autowired
private FriendRepository repository;
public List<Long> getFriends(Long phoneNo)
{
	List<Friend> list=repository.findByPhoneNo(phoneNo);
	List<Long> list2=new ArrayList<>();
	for (Friend fd: list)
	{
		list2.add(fd.getFriendNo());
	}
	return list2;
}
}
