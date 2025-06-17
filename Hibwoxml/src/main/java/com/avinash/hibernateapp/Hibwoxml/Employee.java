package com.avinash.hibernateapp.Hibwoxml;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	private int eid;
	@Column
	private String ename;
	@Column
	private float esal;
	@Column
	private String eaddr;
	public int getEid() {
		return eid;
	}
	public String getEname() {
		return ename;
	}
	public float getEsal() {
		return esal;
	}
	public String getEaddr() {
		return eaddr;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", eaddr=" + eaddr + "]";
	}

}
