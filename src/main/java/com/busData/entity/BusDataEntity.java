package com.busData.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BusDataEntity {
	
	@Id
	private String busNumber;
    private String busType;
    private String driverName;
    private String driverNumber;
    private String busServiceNumber;
    private String source;
    private String destination;
    private int seatsAvailable;
    private String viaRoute;
    private String arrivalTime;
    private String departureTime;
    private String duration;
    private double fare;
    private String acCondition;
	
    public BusDataEntity() {
	}
    
	public BusDataEntity(String busNumber, String busType, String driverName, String driverNumber,
			String busServiceNumber, String source, String destination, int seatsAvailable, String viaRoute,
			String arrivalTime, String departureTime, String duration, double fare, String acCondition) {
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
	public int hashCode() {
		return Objects.hash(acCondition, arrivalTime, busNumber, busServiceNumber, busType, departureTime, destination,
				driverName, driverNumber, duration, fare, seatsAvailable, source, viaRoute);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BusDataEntity other = (BusDataEntity) obj;
		return Objects.equals(acCondition, other.acCondition) && Objects.equals(arrivalTime, other.arrivalTime)
				&& Objects.equals(busNumber, other.busNumber)
				&& Objects.equals(busServiceNumber, other.busServiceNumber) && Objects.equals(busType, other.busType)
				&& Objects.equals(departureTime, other.departureTime) && Objects.equals(destination, other.destination)
				&& Objects.equals(driverName, other.driverName) && Objects.equals(driverNumber, other.driverNumber)
				&& Objects.equals(duration, other.duration)
				&& Double.doubleToLongBits(fare) == Double.doubleToLongBits(other.fare)
				&& seatsAvailable == other.seatsAvailable && Objects.equals(source, other.source)
				&& Objects.equals(viaRoute, other.viaRoute);
	}
	@Override
	public String toString() {
		return "BusDataEntity [busNumber=" + busNumber + ", busType=" + busType + ", driverName=" + driverName
				+ ", driverNumber=" + driverNumber + ", busServiceNumber=" + busServiceNumber + ", source=" + source
				+ ", destination=" + destination + ", seatsAvailable=" + seatsAvailable + ", viaRoute=" + viaRoute
				+ ", arrivalTime=" + arrivalTime + ", departureTime=" + departureTime + ", duration=" + duration
				+ ", fare=" + fare + ", acCondition=" + acCondition + "]";
	}
	
   
}
