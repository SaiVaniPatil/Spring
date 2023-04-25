package com.nerchuko.first.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Id;

@Entity
public class Alien {
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + "]";
	}
	
	
	public Alien()
	{
		
	}
	
	public Alien(int aid, String aname) {
		
		this.aid = aid;
		this.aname = aname;
	}
	@Id
	private int aid;
	private String aname;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	

}
