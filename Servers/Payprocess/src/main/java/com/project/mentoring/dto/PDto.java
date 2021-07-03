package com.project.mentoring.dto;

import java.sql.Date;
import java.sql.Timestamp;

public class PDto {
	
	String username;
	String majorname;
	String submajorname;
	String mentorgender;
	String mentoraddress;
	Timestamp mentorbirth;
	int productpk;
	int starttime;
	int endtime;
	Date startday;
	
	
	public PDto() {
		
	}

	public PDto(String username, String majorname, String submajorname, int productpk) {
		super();
		this.username = username;
		this.majorname = majorname;
		this.submajorname = submajorname;
		this.productpk = productpk;
	}

	

	public PDto(String username, String majorname, String submajorname, String mentorgender, String mentoraddress,
			Timestamp mentorbirth) {
		super();
		this.username = username;
		this.majorname = majorname;
		this.submajorname = submajorname;
		this.mentorgender = mentorgender;
		this.mentoraddress = mentoraddress;
		this.mentorbirth = mentorbirth;
	}



	public PDto(String username, String majorname, String submajorname, Date startday, int starttime, int endtime) {
		super();
		this.username = username;
		this.majorname = majorname;
		this.submajorname = submajorname;
		this.startday = startday;
		this.starttime = starttime;
		this.endtime = endtime;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMajorname() {
		return majorname;
	}

	public void setMajorname(String majorname) {
		this.majorname = majorname;
	}

	public String getSubmajorname() {
		return submajorname;
	}

	public void setSubmajorname(String submajorname) {
		this.submajorname = submajorname;
	}

	public String getMentorgender() {
		return mentorgender;
	}

	public void setMentorgender(String mentorgender) {
		this.mentorgender = mentorgender;
	}

	public String getMentoraddress() {
		return mentoraddress;
	}

	public void setMentoraddress(String mentoraddress) {
		this.mentoraddress = mentoraddress;
	}

	

	public Timestamp getMentorbirth() {
		return mentorbirth;
	}



	public void setMentorbirth(Timestamp mentorbirth) {
		this.mentorbirth = mentorbirth;
	}



	public int getProductpk() {
		return productpk;
	}

	public void setProductpk(int productpk) {
		this.productpk = productpk;
	}

	public int getStarttime() {
		return starttime;
	}

	public void setStarttime(int starttime) {
		this.starttime = starttime;
	}

	public int getEndtime() {
		return endtime;
	}

	public void setEndtime(int endtime) {
		this.endtime = endtime;
	}

	public Date getStartday() {
		return startday;
	}

	public void setStartday(Date startday) {
		this.startday = startday;
	}
	


	
	
	
	
	
	
}//---------------
