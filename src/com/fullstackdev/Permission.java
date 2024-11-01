package com.fullstackdev;

public class Permission {
	
	private String 	permissionId;
	private int 	permissionRoleId;
	private String 	permissionTitle;
	private String 	permissionModule;
	private String 	permissionDescription;
	private static int counter;
	
	static
	{
		counter = 70;
	}
	
	
	//default constructor for dynamic class loading
	
	public Permission()
	{
		
	}
	
	
	//constructor 
	public Permission(int permissionRoleId, String permissionTitle, String permissionModule, String permissionDescription)
	{
		
		this.permissionId 			= "PI"+counter++;
		this.permissionRoleId 		= permissionRoleId;
		this.permissionTitle 		= permissionTitle;
		this.permissionModule 		= permissionModule;
		this.permissionDescription 	= permissionDescription;
		
	}
	
	
	public void addPermission()
	{
		System.out.println("adding permission");
	}
	
	public void editPermission()
	{
		System.out.println("permission edited succuessfully");
	}
	
	public void deletePermission()
	{
		System.out.println("permision to the use is deletes sucessfully");
		
	}
	
	public void searchPermission()
	{
		System.out.println("searching for the permison of the user");
	}
	
	
	//getters and setters of the instance variables
	
	
	public String getPermissionId() {
		return permissionId;
	}
//	public void setPermissionId(String permissionId) {
//		this.permissionId = permissionId;
//	}
	public int getPermissinRoleId() {
		return permissionRoleId;
	}
	public void setPermissinRoleId(int permissinRoleId) {
		this.permissionRoleId = permissinRoleId;
	}
	public String getPermissionTitle() {
		return permissionTitle;
	}
	public void setPermissionTitle(String permissionTitle) {
		this.permissionTitle = permissionTitle;
	}
	public String getPermissionModule() {
		return permissionModule;
	}
	public void setPermissionModule(String permissionModule) {
		this.permissionModule = permissionModule;
	}
	public String getPermissinDescription() {
		return permissionDescription;
	}
	public void setPermissinDescription(String permissinDescription) {
		this.permissionDescription = permissinDescription;
	}
	
	
	
	
	
	
	
	
	
	
}
