package com.fullstackdev;

public class Attendance {
	
	// Has part
	private String attendanceId;
	private String attendanceEmployeeId;
//	private String attendanceStudentId;
	private String attendanceType;
	private String attendanceDescription;
	private static int counter;
	
	static
	{
		counter = 8000;
	}
	
	//default constructor for the dynamic class loading using forName() method of the Class class
	public Attendance()
	{
		
	}
	
	//parameterized constructor for employee
	
	public Attendance(String attendanceEmployeeId, String attendanceType, String attendanceDescription)
	{
		this.attendanceId = "AA"+counter++;
		this.attendanceEmployeeId = attendanceEmployeeId;
		this.attendanceType = attendanceType;
		this.attendanceDescription = attendanceDescription;
	}
	
	// does part
	public void addAttendance()
	{
		System.out.println("attendance record aded");
	}
	public void editAttendance()
	{
		System.out.println("attendance record edited");
	}
	public void deleteAttendace()
	{
		System.out.println("attendace record deleted");
	}
	public void searchAttendace()
	{
		System.out.println("searching for the attendace record");
	}


	
	
	//getters and setters 
	
	public String getAttendanceEmployeeId() {
		return attendanceEmployeeId;
	}

	public void setAttendanceEmployeeId(String attendanceEmployeeId) {
		this.attendanceEmployeeId = attendanceEmployeeId;
	}

	public String getAttendanceType() {
		return attendanceType;
	}

	public void setAttendanceType(String attendanceType) {
		this.attendanceType = attendanceType;
	}

	public String getAttendanceDescription() {
		return attendanceDescription;
	}

	public void setAttendanceDescription(String attendanceDescription) {
		this.attendanceDescription = attendanceDescription;
	}

	public String getAttendanceId() {
		return attendanceId;
	}

	public static int getCounter() {
		return counter;
	}
	
	
	
	
	
}
