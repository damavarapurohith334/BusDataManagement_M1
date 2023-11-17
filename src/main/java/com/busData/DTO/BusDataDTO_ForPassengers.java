package com.busData.DTO;

import jakarta.validation.constraints.Pattern;

public class BusDataDTO_ForPassengers {

	@Pattern(regexp = "^[A-Za-z\\s]+$", message = "Enter only letters and spaces")
    private String busType;
	
	@Pattern(regexp = "^[A-Za-z0-9]+$", message = "alphanumerics only")
    private String busServiceNumber;
	
	@Pattern(regexp = "^[A-Za-z\\s]+$", message = "Allowing letters and spaces")
    private String source;
	
	@Pattern(regexp = "^[A-Za-z\\s]+$", message = "Allowing letters and spaces")
    private String destination;
	
	@Pattern(regexp = "^[1-9]\\d*$", message = "Assuming a positive integer")
    private int seatsAvailable;
	
	@Pattern(regexp = "^[A-Za-z\\s\\.,;:\\-']+", message = "Allowing letters, spaces, and common punctuation")
    private String viaRoute;
	
    private String arrivalTime;
	
    private String departureTime;
	
	@Pattern(regexp = "^\\d+ hours$", message = "Assuming X hours format")
    private String duration;
	
	@Pattern(regexp = "^\\d+(\\.\\d+)?$", message = "Assuming a positive or decimal number")
    private double fare;
	
	@Pattern(regexp = "^(?i)(Yes|No)$", message = "Case-insensitive \"Yes\" or \"No\"")
    private String acCondition;

	public BusDataDTO_ForPassengers() {
	}

	public BusDataDTO_ForPassengers(
			@Pattern(regexp = "^[A-Za-z\\s]+$", message = "Enter only letters and spaces") String busType,
			@Pattern(regexp = "^[A-Za-z0-9]+$", message = "alphanumerics only") String busServiceNumber,
			@Pattern(regexp = "^[A-Za-z\\s]+$", message = "Allowing letters and spaces") String source,
			@Pattern(regexp = "^[A-Za-z\\s]+$", message = "Allowing letters and spaces") String destination,
			@Pattern(regexp = "^[1-9]\\d*$", message = "Assuming a positive integer") int seatsAvailable,
			@Pattern(regexp = "^[A-Za-z\\s\\.,;:\\-']+", message = "Allowing letters, spaces, and common punctuation") String viaRoute,
			String arrivalTime, String departureTime,
			@Pattern(regexp = "^\\d+ hours$", message = "Assuming X hours format") String duration,
			@Pattern(regexp = "^\\d+(\\.\\d+)?$", message = "Assuming a positive or decimal number") double fare,
			@Pattern(regexp = "^(?i)(Yes|No)$", message = "Case-insensitive \"Yes\" or \"No\"") String acCondition) {
		this.busType = busType;
		this.busServiceNumber = busServiceNumber;
		this.source = source;
		this.destination = destination;
		this.seatsAvailable = seatsAvailable;
		this.viaRoute = viaRoute;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.duration = duration;
		this.fare = fare;
		this.acCondition = acCondition;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public String getBusServiceNumber() {
		return busServiceNumber;
	}

	public void setBusServiceNumber(String busServiceNumber) {
		this.busServiceNumber = busServiceNumber;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getSeatsAvailable() {
		return seatsAvailable;
	}

	public void setSeatsAvailable(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}

	public String getViaRoute() {
		return viaRoute;
	}

	public void setViaRoute(String viaRoute) {
		this.viaRoute = viaRoute;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public String getAcCondition() {
		return acCondition;
	}

	public void setAcCondition(String acCondition) {
		this.acCondition = acCondition;
	}

	@Override
	public String toString() {
		return "BusDataDTO_ForPassengers [busType=" + busType + ", busServiceNumber=" + busServiceNumber + ", source="
				+ source + ", destination=" + destination + ", seatsAvailable=" + seatsAvailable + ", viaRoute="
				+ viaRoute + ", arrivalTime=" + arrivalTime + ", departureTime=" + departureTime + ", duration="
				+ duration + ", fare=" + fare + ", acCondition=" + acCondition + "]";
	}

	
}
