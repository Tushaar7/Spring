package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="date_table")
public class CheckAvailabilityModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int dateId;
	private String checkInDate;
	private String checkOutDate;
	
	public int getDateId() {
		return dateId;
	}
	
	public void setDateId(int dateId) {
		this.dateId = dateId;
	}
	
	public String getCheckInDate() {
		return checkInDate;
	}
	
	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}
	
	public String getCheckOutDate() {
		return checkOutDate;
	}
	
	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
}
