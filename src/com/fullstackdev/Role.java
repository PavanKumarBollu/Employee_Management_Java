package com.fullstackdev;

public class Role {
	
	private String 	roleId;
	private String 	roleTitle;
	private String 	roleDescription;
	private static int counter;
	
	static
	{
		counter = 700000;
	}
	
	
	
	//default constructor for dynamic class loading
	public Role()
	{
		
	}
	
	//parameterized constructor
	public Role(String roleTitle, String roleDescription)
	{
		this.roleId 			= "RR" + counter++;
		this.roleTitle 			= roleTitle;
		this.roleDescription 	= roleDescription;
	}
	
	
	//Role class does part
	
	public void addRole()
	{
		System.out.println("adding new role");
	}
	public void editRole()
	{
		System.out.println("role edited ");
	}
	public void deleteRole()
	{
		System.out.println("role delted ");
	}
	public void searchRole()
	{
		System.out.println("searching for the role");
	}
	public void assignRole()
	{
		System.out.println("role assigned ");
	}


	
	
	//getters and setter 
	
	public String getRoleTitle() {
		return roleTitle;
	}

	public void setRoleTitle(String roleTitle) {
		this.roleTitle = roleTitle;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public String getRoleId() {
		return roleId;
	}
	
	
	
	
	
	
}
