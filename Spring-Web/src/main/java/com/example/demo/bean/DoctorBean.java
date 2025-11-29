package com.example.demo.bean;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.*;
@Entity
@Table(name="Doctor101")
public class DoctorBean {
	@Id
	@GeneratedValue
	private int doctorID;
	@Column
	private String doctorName;
	@Column
	private LocalDate dateOfBirth;
	@Column
	private LocalDate dateOfJoining;
	@Column
	private String gender;
	@Column
	private String qualification;
	@Column
	private String specialization;
	@Column
	private int experience;
	@Column
	private String street;
	@Column
	private String location;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private int pincode;
	@Column
	private String contact;
	@Column
	private String email;
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public int getDoctorID() {
		return doctorID;
	}
	public void setDoctorID(int doctorID) {
		this.doctorID = doctorID;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "DoctorBean [doctorID=" + doctorID + ", doctorName=" + doctorName + ", dateOfBirth=" + dateOfBirth
				+ ", dateOfJoining=" + dateOfJoining + ", gender=" + gender + ", qualification=" + qualification
				+ ", specialization=" + specialization + ", experience=" + experience + ", street=" + street
				+ ", location=" + location + ", city=" + city + ", state=" + state + ", pincode=" + pincode
				+ ", contact=" + contact + ", email=" + email + "]";
	}

	
	
}
