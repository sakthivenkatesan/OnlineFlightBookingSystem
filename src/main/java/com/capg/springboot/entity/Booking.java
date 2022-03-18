//Manoj Kumar V
package com.capg.springboot.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="booking")
public class Booking {
	private int Id;
	private long bookingNumber;
	private int bookingDate;
	private int travelDate;
	private double totalCost;
	
	@OneToOne(mappedBy = "booking",fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    private User user;
	
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Booking(int id, long bookingNumber, int bookingDate, int travelDate, double totalCost) {
		super();
		Id = id;
		this.bookingNumber = bookingNumber;
		this.bookingDate = bookingDate;
		this.travelDate = travelDate;
		this.totalCost = totalCost;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public long getBookingNumber() {
		return bookingNumber;
	}
	public void setBookingNumber(long bookingNumber) {
		this.bookingNumber = bookingNumber;
	}
	public int getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(int bookingDate) {
		this.bookingDate = bookingDate;
	}
	public int getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(int travelDate) {
		this.travelDate = travelDate;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	
	
	

}