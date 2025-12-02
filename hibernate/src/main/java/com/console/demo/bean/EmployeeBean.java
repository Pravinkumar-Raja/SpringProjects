package com.console.demo.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Console")
public class EmployeeBean {
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String name;
	@Column
	private int salary;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "manager_managerName")
	private ManagerBean manager;
	public ManagerBean getManager() {
	return manager;
	}

	public void setManager(ManagerBean manager) {
	this.manager = manager;
	}

	public int getId() {
	return id;
	}

	public void setId(int id) {
	this.id = id;
	}

	public String getName() {
	return name;

	}

	public void setName(String name) {
	this.name = name;

	}

	public int getSalary() {
	return salary;

	}

	public void setSalary(int salary) {
	this.salary = salary;

	}
}


