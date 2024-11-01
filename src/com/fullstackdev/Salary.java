package com.fullstackdev;

public class Salary {
	//has a part
	private String salaryId;
	private String salaryDescription;
	private String salaryType;
	private String salaryAmount;
	private String salaryTotal;
	private String employeeId;
	
	private static int counter ;
	
	static
	{
		counter = 80;
	}
	
	
	
//	default constructor for the dynamic class loading
	public Salary()
	{
		
	}
//	parameterized constructor
	public Salary(String salaryDescription, String salaryType, String salaryAmount, String salaryTotal, String employeeId )
	{
		this.salaryId 			= "SS" + counter++;
		this.salaryDescription	= salaryDescription;
		this.salaryType 		= salaryType;
		this.salaryAmount		= salaryAmount;
		this.salaryTotal		= salaryTotal;
		this.employeeId			= employeeId;
	}
	
	
	//does part
	public void addSalary()
	{
		System.out.println("salary Added");
	}
	
	public void editSalary()
	{
		System.out.println("salary edited");
	}
	public void deleteSalary()
	{
		System.out.println("salary deleted");
	}
	public void searchSalary()
	{
		System.out.println("searching for the salary");
	}

	
	
	//getters and setters of the instance variables
	
	public String getSalaryDescription() {
		return salaryDescription;
	}
	public void setSalaryDescription(String salaryDescription) {
		this.salaryDescription = salaryDescription;
	}
	public String getSalaryType() {
		return salaryType;
	}
	public void setSalaryType(String salaryType) {
		this.salaryType = salaryType;
	}
	public String getSalaryAmount() {
		return salaryAmount;
	}
	public void setSalaryAmount(String salaryAmount) {
		this.salaryAmount = salaryAmount;
	}
	public String getSalaryTotal() {
		return salaryTotal;
	}
	public void setSalaryTotal(String salaryTotal) {
		this.salaryTotal = salaryTotal;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getSalaryId() {
		return salaryId;
	}
	public static int getCounter() {
		return counter;
	}
	
	
	
	
	
}
