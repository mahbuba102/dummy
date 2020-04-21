package com.talentech.hr;

public class Employee  {

	private int id; //member variables or attributes should always be private 
	private String firstName;
	private String lastName;
	private int ssn;
	private double salary;
	private int departmentId;
	
	
	public static final int comapnyId = 2561;
	public static String companyName;
	
	
	public static String getComapnyName(){
		
		return companyName;
	}
	
	private Department department; // deartment is a member variable of type Department
	
	private Region region;
	private Location location;
	private JobHistory jobHistory;
	
	
	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	
	
	
	
	public JobHistory getJobHistory() {
		return jobHistory;
	}

	public void setJobHistory(JobHistory jobHistory) {
		this.jobHistory = jobHistory;
	}
	
	
	
	

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getFirstName (){
		return this.firstName;
		
	}
	
	public Department getDepartment(){
		
		return this.department;
	}
	

	public Employee(int ID, String FN,String LN, int SSN, double sal,int deptId,Department department,Location location,JobHistory jobHistory,Region region){

		this.id = ID;  //001
		this.firstName = FN; //Mahbuba
		this.lastName = LN; //Nimme
		this.ssn = SSN;
		this.salary = sal;
		this.departmentId = deptId;
		this.region = region;
		this.location = location;
		this.jobHistory = jobHistory;

	}
	
//	public Employee(int ID, String FN,String LN, int SSN, double sal,int deptId,Department dept){
//
//		this.id = ID;  //001
//		this.firstName = FN; //Mahbuba
//		this.lastName = LN; //Nimme
//		this.ssn = SSN;
//		this.salary = sal;
//		this.departmentId = deptId;
//		this.department = dept;
//
//	}
//	


}
