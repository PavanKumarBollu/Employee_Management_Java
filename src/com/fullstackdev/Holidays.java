package com.fullstackdev;

import java.util.Date;

public class Holidays {
	
	public String holidayId;
	public String holidayEmployeeId;
	public String holidayDuration;
	public String holidayDescription;
	public Date holidayDate;
	
	public static int counter;
	
	static
	{
		counter = 800000;
	}
	//default constructor 
	public Holidays()
	{
		
	}
	
	//parameterized constructor
	public Holidays(String holidayEmployeeId, String holidayDuration, String holidayDescription, Date holidayDate)
	{
		this.holidayId = "HH" + counter++;
		this.holidayEmployeeId 	= holidayEmployeeId;
		this.holidayDuration	= holidayDuration;
		this.holidayDescription = holidayDescription;
		this.holidayDate 		= holidayDate;
	}
	
	
	//does part
	public void addHolidays()
	{
		System.out.println("added holidays");
	}
	public void editHolidays()
	{
		System.out.println("edited holidays");
	}
	public void deleteHolidays()
	{
		System.out.println("holidays are deleted");
	}
	public void searchHolidays()
	{
		System.out.println("searching for the holidays record");
	}

	//getters and setters 
	
	public String getHolidayEmployeeId() {
		return holidayEmployeeId;
	}

	public void setHolidayEmployeeId(String holidayEmployeeId) {
		this.holidayEmployeeId = holidayEmployeeId;
	}

	public String getHolidayDuration() {
		return holidayDuration;
	}

	public void setHolidayDuration(String holidayDuration) {
		this.holidayDuration = holidayDuration;
	}

	public String getHolidayDescription() {
		return holidayDescription;
	}

	public void setHolidayDescription(String holidayDescription) {
		this.holidayDescription = holidayDescription;
	}

	public Date getHolidayDate() {
		return holidayDate;
	}

	public void setHolidayDate(Date holidayDate) {
		this.holidayDate = holidayDate;
	}

	public String getHolidayId() {
		return holidayId;
	}

	public static int getCounter() {
		return counter;
	}
	
	
	
	
	
	
	
}
