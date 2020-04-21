package com.talentech.hr;

public class Department {


	//Deaprtment_ID ,Department_Name,Manager_ID and Location_ID 

	private int departmentId; //2
	private String deprtamentName;//Information technology
	private int managerId; //3
	private int locationId; //4


	//getter method for departmentId
	public int getDepartmentId(){
		return this.departmentId; // 1

	}
	
	
    
	//getter method for deprtamentName
	public String getDepartmentName(){
		return this.deprtamentName; //Accounting

	}


	///getter for manager id
	public int getManagerId(){
		return this.managerId;

	}

	//setter for manager id 
	public void setManagerId(int mangId){
		this.managerId = mangId;

	}



	///getter for location id
	public int getLocationId(){
		return this.locationId;

	}

	//setter for location id 
	public void setLocationId(int locId){
		this.locationId = locId;

	}



	public Department(){      // no-argument constructor

		System.out.println(" Object Created");
	}

	//what is the function of "this" operator?

	public Department (int deptId,String deptName,int mgrId, int locId){  //constructor with arguments 
		this.departmentId = deptId; //02
		this.deprtamentName = deptName;//Information Technology
		this.managerId = mgrId; // 3
		this.locationId = locId;//4

	}





}
