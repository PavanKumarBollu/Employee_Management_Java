package com.fullstackdev;

public class Employee {

	private String employeeId;
	private String employeeName;
	private String employeeMobile;
	private String employeeEmail;
	private String employeeAddress;
	private String employeeUserName;
	private String employeePassword;
	private static int counter ;
	
	static
	{
		counter = 7000;
	}
	
	//default constructor for the dynamic class loading
	public Employee()
	{
		
	}
	
	//constructor
	public Employee(String employeeName, String employeeMobile, String employeeEmail, String employeeAddress, String employeeUserName, String employeePassword)
	{
		this.employeeId 		= "EE" + counter++;
		this.employeeName		= employeeName;
		this.employeeMobile		= employeeMobile;
		this.employeeEmail		= employeeEmail;
		this.employeeAddress	= employeeAddress;
		this.employeeUserName	= employeeUserName;
		this.employeePassword	= employeePassword;
	}
	
	// employer does a functionality
	public void addEmployee()
	{
		System.out.println("adding new employee");
	}
	
	public void editEmployee()
	{
		System.out.println("employee details are updated");
	}
	public void deleteEmployees()
	{
		System.out.println("employee deleted");
	}
	public void searchEmployee()
	{
		System.out.println("searching for the employee");
	}

	
	
	//getters and setters of the employee instance variables
	
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeMobile() {
		return employeeMobile;
	}

	public void setEmployeeMobile(String employeeMobile) {
		this.employeeMobile = employeeMobile;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public String getEmployeeUserName() {
		return employeeUserName;
	}

	public void setEmployeeUserName(String employeeUserName) {
		this.employeeUserName = employeeUserName;
	}

	public String getEmployeePassword() {
		return employeePassword;
	}

	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}

	public String getEmployeeId() {
		return employeeId;
	}
	
	
	
	
}
