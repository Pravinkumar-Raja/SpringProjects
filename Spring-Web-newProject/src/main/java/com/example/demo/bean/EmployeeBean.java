package com.example.demo.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EmpTable")
public class EmployeeBean {
	@Id
	@GeneratedValue
	@Column(name="Id")
	private int eid;
	@Column(name="Name_of_Employee")
	private String ename;
	@Column(name="Salary")
	private int esal;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "EmployeeBean [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}
	
	

}
