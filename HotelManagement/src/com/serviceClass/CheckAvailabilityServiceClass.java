package com.serviceClass;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.daoClass.CheckAvailabilityClass;
import com.daoInterface.CheckAvailabilityInterface;
import com.model.CheckAvailabilityModel;
import com.serviceInterface.CheckAvailabilityServiceInterface;

@Service
public class CheckAvailabilityServiceClass implements CheckAvailabilityServiceInterface {

	@Autowired
	private CheckAvailabilityInterface availabilityInterface;

	public CheckAvailabilityInterface getAvailabilityInterface() {
		return availabilityInterface;
	}

	public void setAvailabilityInterface(
			CheckAvailabilityInterface availabilityInterface) {
		this.availabilityInterface = availabilityInterface;
	}



	@Transactional
	public void saveDate(String date1, String date2) {
		availabilityInterface.saveDate(date1, date2);
		
	}

	@Transactional
	public List<String> CheckBookedRoom() {
		// TODO Auto-generated method stub
		return availabilityInterface.CheckBookedRoom();
	}

	@Transactional
	public HashMap getBookedRoomList() {
		// TODO Auto-generated method stub
		return availabilityInterface.getBookedRoomList();
	}
	
}
