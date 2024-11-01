package com.fullstackdev;

public class Leave {

	private String leaveId;
	private String leaveType;
	private String leaveDescription;
	private String leaveStatus;
	private String leaveTo;
	private String leaveFrom;
	private String leaveEmployeeId;
	
	private static int counter;
	
	static
	{
		counter = 90;
	}
	
	
	
	//default constructor
	public Leave()
	{
		
	}
	//parameterized constructor
	public Leave(String leaveType, String leaveDescription, String leaveStatus, String leaveTo, String leaveFrom, String leaveEmployeeId )
	{
		this.leaveId 			= "LL" + counter++;	
		this.leaveType 			= leaveType;
		this.leaveDescription	= leaveDescription;
		this.leaveStatus		= leaveStatus;
		this.leaveTo			= leaveTo;
		this.leaveFrom			= leaveFrom;
		this.leaveEmployeeId	= leaveEmployeeId;
	}
	
	//does part
	
	public void addLeave()
	{
		System.out.println("Adding leave");
	}
	
	public void editLeave()
	{
		System.out.println("editing the leave");
		
	}
	
	
	//getters and setters
	
	public void deleteLeave()
	{
		System.out.println("Leaves are deleted");
	}
	
	public void searchLeave()
	{
		System.out.println("searching for the leave");
	}
	public String getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	public String getLeaveDescription() {
		return leaveDescription;
	}
	public void setLeaveDescription(String leaveDescription) {
		this.leaveDescription = leaveDescription;
	}
	public String getLeaveStatus() {
		return leaveStatus;
	}
	public void setLeaveStatus(String leaveStatus) {
		this.leaveStatus = leaveStatus;
	}
	public String getLeaveTo() {
		return leaveTo;
	}
	public void setLeaveTo(String leaveTo) {
		this.leaveTo = leaveTo;
	}
	public String getLeaveFrom() {
		return leaveFrom;
	}
	public void setLeaveFrom(String leaveFrom) {
		this.leaveFrom = leaveFrom;
	}
	public String getLeaveEmployeeId() {
		return leaveEmployeeId;
	}
	public void setLeaveEmployeeId(String leaveEmployeeId) {
		this.leaveEmployeeId = leaveEmployeeId;
	}
	public String getLeaveId() {
		return leaveId;
	}
	public static int getCounter() {
		return counter;
	}
	
	

	
	
	
}
