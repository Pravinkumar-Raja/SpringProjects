package com.example.demo.bean;

import jakarta.persistence.*;

@Entity
@Table(name="stu555")
public class StudentBean {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int stdid;
@Column
private String stdName;
@Column
private String department;
@Column
private int age;
@Column
private String phone;
@Column
private String status;
@Column
private Integer marks;

public Integer getMarks() {
	return marks;
}
public void setMarks(Integer marks) {
	this.marks = marks;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public int getStdid() {
	return stdid;
}
public void setStdid(int stdid) {
	this.stdid = stdid;
}
public String getStdName() {
	return stdName;
}
public void setStdName(String stdName) {
	this.stdName = stdName;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "StudentBean [stdid=" + stdid + ", stdName=" + stdName + ", department=" + department + ", age=" + age
			+ ", phone=" + phone + ", status=" + status + ", marks=" + marks + "]";
}


}
