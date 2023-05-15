package com.sathya.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Friend")
public class Friend 
{
@Id
@Column(name="Id")
private Integer id;
@Column(name="phone_no")
private Long phoneNo;
@Column(name="Friend_no")
private Long friendNo;
public Friend() {
	super();
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Long getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(Long phoneNo) {
	this.phoneNo = phoneNo;
}
public Long getFriendNo() {
	return friendNo;
}
public void setFriendNo(Long friendNo) {
	this.friendNo = friendNo;
}
@Override
public String toString() {
	return "Friend [id=" + id + ", phoneNo=" + phoneNo + ", friendNo=" + friendNo + "]";
}

}
