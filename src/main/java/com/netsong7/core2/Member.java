package com.netsong7.core2;

import java.util.Date;

public class Member {
	private String 	userid;
    private	String	userpw;
    private	String	username;
    private	String	email;
    private	Date	regdate;
    private	Date	updatedate;
    
	@Override
	public String toString() {
		return "Member[" + userid + ", " + userpw + ", " + username + 
			", " + email + ", " + regdate + ", " + updatedate + "]";
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public Date getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
}
