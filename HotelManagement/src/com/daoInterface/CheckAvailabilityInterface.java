package com.daoInterface;

import java.util.HashMap;
import java.util.List;

import com.model.CheckAvailabilityModel;

public interface CheckAvailabilityInterface {

	
	public void saveDate(String date1, String date2);
	public List<String> CheckBookedRoom();
	
	public HashMap getBookedRoomList();

}
