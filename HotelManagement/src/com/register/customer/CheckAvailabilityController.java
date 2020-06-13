package com.register.customer;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.CheckAvailabilityModel;
import com.serviceInterface.CheckAvailabilityServiceInterface;

@Controller
public class CheckAvailabilityController {

	@Autowired
	private CheckAvailabilityServiceInterface checkingService;
	
	@RequestMapping(value="/CheckAvailabilityAction.html")
	public String CheckAvailable(Model model){		
		System.out.println("Check Availability Controller");

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String currentDate = sdf.format(date);
		
		System.out.println("Currentdate: " + currentDate);
		
		model.addAttribute("currentDate",currentDate);

/*		
		HashMap RoomBookNoList = new HashMap<>();
		RoomBookNoList = checkingService.getBookedRoomList();
		model.addAttribute("RoomBookNoList", RoomBookNoList);
		System.out.println("RoomBookNoList from Controller: " + RoomBookNoList);		
*/		
		return "CheckAvailblePageView";
	}


	@RequestMapping(value="dateSaveAndCheck.html")
	public String saveAndCompareDate(@RequestParam Map<String, String> getdates,CheckAvailabilityModel chk, Model model) throws Exception  {
		
		String roomno = getdates.get("room");
		String date1 = getdates.get("date1");
		String date2 = getdates.get("date2");	
		
		model.addAttribute("roomno", roomno);
		
		
		SimpleDateFormat fr = new SimpleDateFormat("dd-MM-yyyy");
		Date dt1=fr.parse(date1);
		Date dt2=fr.parse(date2);
		
		System.out.println("Room No: " + roomno);
		System.out.println("Date1: " + dt1);
		System.out.println("Date2: " + dt2);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("EEEE");
		String day1 = sdf1.format(dt1);
		String day2 = sdf1.format(dt2);
		
		System.out.println("Day1: " + day1);
		System.out.println("Day2: " + day2);
		
		long diff=dt2.getTime()-dt1.getTime();
		long Daydiff=diff/(24*60*60*1000);
		
		System.out.println("Days Difference is: "+Daydiff);

/*		
		if (Daydiff>=2 &&(day1.equals("Monday")||(day1.equals("Friday"))) &&(day2.equals("Monday")||(day2.equals("Friday")))) {
			System.out.println("Check in Criteria Matched!");
			model.addAttribute("Message1", "You Can Check-In...");
		}else if((day2.equals("Monday")||(day2.equals("Friday")))){
			model.addAttribute("Message1", "You Can Check-out...");
			
		}else {
			System.out.println("No Matched");
			model.addAttribute("Message1", "You Can Not Check-In...");
		}

*/		
		
		if (Daydiff>=2 &&(day1.equals("Monday")||(day1.equals("Friday"))) &&(day2.equals("Monday")||(day2.equals("Friday")))) {
			System.out.println("Check in Criteria Matched!");
			model.addAttribute("Message1", "Check-In...");
		} else {
			System.out.println("No Matched");
			model.addAttribute("Message1", "You Can Not Check-In...");
		}
		
		
		HashMap RoomBookNoList = new HashMap<>();
		RoomBookNoList = checkingService.getBookedRoomList();
		model.addAttribute("RoomBookNoList", RoomBookNoList);
		System.out.println("RoomBookNoList from Controller: " + RoomBookNoList);
		System.out.println("RoomBookNoList Size from Controller: " + RoomBookNoList.size());
		System.out.println("RoomBookNoList Values from Controller: " + RoomBookNoList.values());
		System.out.println("roomno: " + roomno);

		for(int i=0 ; i<RoomBookNoList.size(); i++){
			
			if(RoomBookNoList.values().contains(roomno)){
				System.err.println("Room is Already Book");
				model.addAttribute("Message2", "Not Available");
			}else{
				System.out.println("Room is Available...");
				model.addAttribute("Message2", "Available");
			}
				
		}
		
		
		return "CheckAvailblePageView";
	}
	
	
	
	public CheckAvailabilityServiceInterface getCheckingService() {
		return checkingService;
	}
	public void setCheckingService(CheckAvailabilityServiceInterface checkingService) {
		this.checkingService = checkingService;
	}

}
