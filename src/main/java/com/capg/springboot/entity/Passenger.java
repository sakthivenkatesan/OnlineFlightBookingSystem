//Ajith Vishwa V S
package com.capg.springboot.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="passenger")
public class Passenger {
	@Id
	private int passengerId;
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	private String passportNo;
	private String mealPref;
	
	@OneToOne(mappedBy = "passenger",fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    private User User;
	
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Passenger(int id, String firstName, String lastName, int age, String gender, String passportNo,
			String mealPref) {
		super();
		this.passengerId = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.passportNo = passportNo;
		this.mealPref = mealPref;
	}
	public int getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassportNo() {
		return passportNo;
	}
	public void setPssportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	public String getMealPref() {
		return mealPref;
	}
	public void setMealPref(String mealPref) {
		this.mealPref = mealPref;
	}
	

}