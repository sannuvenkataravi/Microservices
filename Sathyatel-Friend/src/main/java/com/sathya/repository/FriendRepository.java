package com.sathya.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sathya.entity.Friend;

@Repository
public interface FriendRepository extends JpaRepository<Friend,Long>
{
	List<Friend> findByPhoneNo(Long phoneNo);
}
