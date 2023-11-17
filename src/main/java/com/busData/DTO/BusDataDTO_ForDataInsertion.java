package com.busData.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class BusDataDTO_ForDataInsertion {

	@NotEmpty(message = "It is mandatory field please enter bus number")
	@NotBlank(message = "It is mandatory field please enter bus number")
	@Pattern(regexp = "^[A-Z]{2}\\d{3}$", message = "Assuming an alphanumeric pattern like KA123")
	private String busNumber;
	
	@NotEmpty(message = "It is mandatory field please enter bus type")
	@Pattern(regexp = "^[A-Za-z\\\\s-]+$", message = "Enter only letters and spaces")
    private String busType;
	
	@NotEmpty(message = "It is mandatory field please enter Driver Name")
	@Pattern(regexp = "^[A-Za-z\\s\\.\\-']+", message = "Enter only letters and spaces")
	private String driverName;
	
	@NotEmpty(message = "It is mandatory field please enter Driver Number")
	@Pattern(regexp = "^[789]\\d{9}$", message = "Assuming a 10-digit Indian mobile number")
	private String driverNumber;
	
	@NotEmpty(message = "It is mandatory field please enter Bus Service Number")
	@Pattern(regexp = "^[A-Za-z0-9]+$", message = "alphanumerics only")
    private String busServiceNumber;
	
	@NotEmpty(message = "It is mandatory field please enter source")
	@Pattern(regexp = "^[A-Za-z\\s]+$", message = "Allowing letters and spaces")
    private String source;
	
	@NotEmpty(message = "It is mandatory field please enter destination")
	@Pattern(regexp = "^[A-Za-z\\s]+$", message = "Allowing letters and spaces")
    private String destination;
	
    private int seatsAvailable;
	
	@NotEmpty(message = "It is mandatory field please enter viaRoute")
	@Pattern(regexp = "^[A-Za-z\\s\\.,;:\\-']+", message = "Allowing letters, spaces, and common punctuation")
    private String viaRoute;
	
	@NotEmpty(message = "It is mandatory field please enter arrivalTime")
    private String arrivalTime;
	
	@NotEmpty(message = "It is mandatory field please enter departureTime")
    private String departureTime;
	
	@NotEmpty(message = "It is mandatory field please enter duration")
	@Pattern(regexp = "^\\d+ hours$", message = "Assuming X hours format")
    private String duration;
	
    private double fare;
	
	@NotEmpty(message = "It is mandatory field please enter acCondition")
	@Pattern(regexp = "^(?i)(Yes|No)$", message = "Case-insensitive \"Yes\" or \"No\"")
    private String acCondition;

	public BusDataDTO_ForDataInsertion() {
	}

	public BusDataDTO_ForDataInsertion(
			@NotNull(message = "It is mandatory field please enter bus number") @NotBlank(message = "It is mandatory field please enter bus number") @Pattern(regexp = "^[A-Z]{2}\\d{3}$", message = "Assuming an alphanumeric pattern like KA123") String busNumber,
			@NotNull(message = "It is mandatory field please enter bus type") @NotBlank(message = "It is mandatory field please enter bus type") @Pattern(regexp = "^[A-Za-z\\s]+$", message = "Enter only letters and spaces") String busType,
			@NotNull(message = "It is mandatory field please enter Driver Name") @NotBlank(message = "It is mandatory field please enter Driver Name") @Pattern(regexp = "^[A-Za-z\\s\\.\\-']+", message = "Enter only letters and spaces") String driverName,
			@NotNull(message = "It is mandatory field please enter Driver Number") @NotBlank(message = "It is mandatory field please enter Driver Number") @Pattern(regexp = "^[789]\\d{9}$", message = "Assuming a 10-digit Indian mobile number") String driverNumber,
			@NotNull(message = "It is mandatory field please enter Bus Service Number") @NotBlank(message = "It is mandatory field please enter Bus Service Number") @Pattern(regexp = "^[A-Za-z0-9]+$", message = "alphanumerics only") String busServiceNumber,
			@NotNull(message = "It is mandatory field please enter source") @NotBlank(message = "It is mandatory field please enter source") @Pattern(regexp = "^[A-Za-z\\s]+$", message = "Allowing letters and spaces") String source,
			@NotNull(message = "It is mandatory field please enter destination") @NotBlank(message = "It is mandatory field please enter destination") @Pattern(regexp = "^[A-Za-z\\s]+$", message = "Allowing letters and spaces") String destination,
			@NotNull(message = "It is mandatory field please enter Seats Available") @NotBlank(message = "It is mandatory field please enter Seats Available") @Pattern(regexp = "^[1-9]\\d*$", message = "Assuming a positive integer") int seatsAvailable,
			@NotNull(message = "It is mandatory field please enter viaRoute") @NotBlank(message = "It is mandatory field please enter viaRoute") @Pattern(regexp = "^[A-Za-z\\s\\.,;:\\-']+", message = "Allowing letters, spaces, and common punctuation") String viaRoute,
			@NotNull(message = "It is mandatory field please enter arrivalTime") @NotBlank(message = "It is mandatory field please enter arrivalTime") String arrivalTime,
			@NotNull(message = "It is mandatory field please enter departureTime") @NotBlank(message = "It is mandatory field please enter departureTime") String departureTime,
			@NotNull(message = "It is mandatory field please enter duration") @NotBlank(message = "It is mandatory field please enter duration") @Pattern(regexp = "^\\d+ hours$", message = "Assuming X hours format") String duration,
			@NotNull(message = "It is mandatory field please enter fare") @NotBlank(message = "It is mandatory field please enter fare") @Pattern(regexp = "^\\d+(\\.\\d+)?$", message = "Assuming a positive or decimal number") double fare,
			@NotNull(message = "It is mandatory field please enter acCondition") @NotBlank(message = "It is mandatory field please enter acCondition") @Pattern(regexp = "^(?i)(Yes|No)$", message = "Case-insensitive \"Yes\" or \"No\"") String acCondition) {
		this.busNumber = busNumber;
		this.busType = busType;
		this.driverName = driverName;
		this.driverNumber = driverNumber;
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

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getDriverNumber() {
		return driverNumber;
	}

	public void setDriverNumber(String driverNumber) {
		this.driverNumber = driverNumber;
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
		return "BusDataDTO_ForDataInsertion [busNumber=" + busNumber + ", busType=" + busType + ", driverName="
				+ driverName + ", driverNumber=" + driverNumber + ", busServiceNumber=" + busServiceNumber + ", source="
				+ source + ", destination=" + destination + ", seatsAvailable=" + seatsAvailable + ", viaRoute="
				+ viaRoute + ", arrivalTime=" + arrivalTime + ", departureTime=" + departureTime + ", duration="
				+ duration + ", fare=" + fare + ", acCondition=" + acCondition + "]";
	}

	
}
