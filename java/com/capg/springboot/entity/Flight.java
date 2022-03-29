//Sasirekha U
package com.capg.springboot.entity;
import javax.persistence.*;
import java.util.Date;

public class Flight {
	
	@Id
	@Column(name = "id", unique = true, nullable = false)

	private int id;
	@Column(name = "departure")
	private String departureLocation;
	@Column(name = "arrival")
	private String arrivalLocation;
	Fleet fleet;
	FlightStatus status;
	@Column(name = "departuret")
	private Date departureTime=new Date();
	@Column(name = "arrivalt")
	private Date arrivalTime =new Date();
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public String getDepartureLocation() {
		return departureLocation;
	}
	public void setDepartureLocation(String departureLocation)
	{
		this.departureLocation=departureLocation;
	}
	
	public String getArrivalLocation()
	{
		return arrivalLocation;
	}
	public void setArrivalLocation(String arrivalLocation)
	{
		this.arrivalLocation=arrivalLocation;
	}
	public Date getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Date departureTime)
	{
		this.departureTime=departureTime;
	}
	
	public Date getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Date arrivalTime)
	{
		this.arrivalTime=arrivalTime;
	}
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Flight(int id, String departureLocation, String arrivalLocation, Date departureTime,Date arrivalTime) {
		super();
		this.id = id;
		this.departureLocation = departureLocation;
		this.arrivalLocation = arrivalLocation;
		this.departureTime = departureTime;
		this.arrivalTime=arrivalTime;
		
	}
	
	
	

}