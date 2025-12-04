package com.example.demo.bean;

import jakarta.persistence.*;
@Entity
@Table(name="doc555")
public class DoctorBean {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int doctorId;
@Column
private String doctorName;
@Column
private String specialization;
@Column
private int experience;
public int getDoctorId() {
	return doctorId;
}
public void setDoctorId(int doctorId) {
	this.doctorId = doctorId;
}
public String getDoctorName() {
	return doctorName;
}
public void setDoctorName(String doctorName) {
	this.doctorName = doctorName;
}
public String getSpecialization() {
	return specialization;
}
public void setSpecialization(String specialization) {
	this.specialization = specialization;
}
public int getExperience() {
	return experience;
}
public void setExperience(int experience) {
	this.experience = experience;
}
@Override
public String toString() {
	return "DoctorBean [doctorId=" + doctorId + ", doctorName=" + doctorName + ", specialization=" + specialization
			+ ", experience=" + experience + "]\n";
}



}
