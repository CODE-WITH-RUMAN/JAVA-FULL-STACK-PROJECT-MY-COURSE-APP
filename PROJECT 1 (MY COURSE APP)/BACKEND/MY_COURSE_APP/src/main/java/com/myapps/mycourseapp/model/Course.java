package com.myapps.mycourseapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

	@Id
	private int cid;
	private String cname;
	private String cdesc;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCdesc() {
		return cdesc;
	}
	public void setCdesc(String cdesc) {
		this.cdesc = cdesc;
	}
	
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", cdesc=" + cdesc + "]";
	}
	
	
	
}
