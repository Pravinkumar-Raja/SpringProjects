package com.example.demo.bean;


public class FlightBean {

private int flightId;

private String flightName;
private int seatingCapacity;
private int reservationCapacity;
public int getFlightId() {
	return flightId;
}
public void setFlightId(int flightId) {
	this.flightId = flightId;
}
public String getFlightName() {
	return flightName;
}
public void setFlightName(String flightName) {
	this.flightName = flightName;
}
public int getSeatingCapacity() {
	return seatingCapacity;
}
public void setSeatingCapacity(int seatingCapacity) {
	this.seatingCapacity = seatingCapacity;
}
public int getReservationCapacity() {
	return reservationCapacity;
}
public void setReservationCapacity(int reservationCapacity) {
	this.reservationCapacity = reservationCapacity;
}
@Override
public String toString() {
	return "FlightBean [flightId=" + flightId + ", flightName=" + flightName + ", seatingCapacity=" + seatingCapacity
			+ ", reservationCapacity=" + reservationCapacity + "]\n";
}



}
