package com.example.demo.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="manager")
public class ManagerBean {
	@Id
	@GeneratedValue
	private int managerId;
	
	@Column
	@OneToOne
	private String managerName;
	@Column
	private String departmentName;
	@Column
	private String location;
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "ManagerBean [managerId=" + managerId + ", managerName=" + managerName + ", departmentName="
				+ departmentName + ", location=" + location + "]";
	}
	
	

}
