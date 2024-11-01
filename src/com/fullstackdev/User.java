package com.fullstackdev;

public class User {
	//has part
	private String userId;
	private String userRoleId;
	private String userName;
	private String userEmail;
	private String userDob;
	private String userAddress;
	private static int counter;
	
	//user has a role
	private Role role;
	
	//user has a permission
	private Permission permission;
	
	
	
	
	
	
	static
	{
		counter = 70000000;
	}
	
	
	
	//default constructor for dynamic loading of the class
	public User()
	{
		
	}
	//parameterized constructor
	public User(String userRoleId, String userName, String userEmail, String userDob, String userAddress, Role role, Permission permission)
	{
		this.userId 	= "UU" + counter++;
		this.userRoleId = userRoleId;
		this.userName	= userName;
		this.userEmail 	= userEmail;
		this.userDob	= userDob;
		this.userAddress= userAddress;
		this.role = role;
		this.permission = permission;
	}
	
	//class does part
	
	public void addUser()
	{
		System.out.println("user added");
	}
	public void editUser()
	{
		System.out.println("user details are updated");
	}
	public void deleteUser()
	{
		System.out.println("user deleted");
	}
	public void searchUser()
	{
		System.out.println("Searching the user");
	}

	
	
	//getters and setters of the class instances 
	
	public String getUserRoleId() {
		return userRoleId;
	}
	public void setUserRoleId(String userRoleId) {
		this.userRoleId = userRoleId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserDob() {
		return userDob;
	}
	public void setUserDob(String userDob) {
		this.userDob = userDob;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserId() {
		return this.userId;
	}
		
	public void setRole(Role role)
	{
		this.role = role;
	}
	public Role getRole()
	{
		return role;
	}
	
	public void setPermission(Permission permission)
	{
		this.permission = permission;
	}
	public Permission getPermission()
	{
		return this.permission;
	}
	
	
	
	
}
