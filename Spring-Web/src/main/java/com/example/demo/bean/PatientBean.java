package com.example.demo.bean;

import java.sql.Date;
import java.time.LocalDate;

public class PatientBean {

	private String patientID;
	private String userID; 
	private LocalDate appointmentDate ;
	private String ailmentType ;
	private String  ailmentDetails; 
	private String diagnosisHistory;
	public String getPatientID() {
		return patientID;
	}
	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getAilmentType() {
		return ailmentType;
	}
	public void setAilmentType(String ailmentType) {
		this.ailmentType = ailmentType;
	}
	public String getAilmentDetails() {
		return ailmentDetails;
	}
	public void setAilmentDetails(String ailmentDetails) {
		this.ailmentDetails = ailmentDetails;
	}
	public String getDiagnosisHistory() {
		return diagnosisHistory;
	}
	public void setDiagnosisHistory(String diagnosisHistory) {
		this.diagnosisHistory = diagnosisHistory;
	}
	@Override
	public String toString() {
		return "PatientBean [patientID=" + patientID + ", userID=" + userID + ", appointmentDate=" + appointmentDate
				+ ", ailmentType=" + ailmentType + ", ailmentDetails=" + ailmentDetails + ", diagnosisHistory="
				+ diagnosisHistory + "]";
	}
	
	
	  
}
