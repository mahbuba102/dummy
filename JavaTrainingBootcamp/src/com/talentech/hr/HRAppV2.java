package com.talentech.hr;

public class HRAppV2 {
	
	public static void main(String[] args) {
		
		
		Employee.companyName = "CIGNA";
		
		System.out.println("Comapany Name = " + Employee.getComapnyName());
		
		Employee.comapnyId = 3674;
		
		
		
		
		
		Region region1 = new Region(02, "North America");
		Department department1 =  new Department(03,"IT",02,01);
		Location location1= new Location(01, "83 April Dr", "06088", "Bloomfield", "Rhode Island", "USA");
		JobHistory jobHistory1 = new JobHistory(005, "05-01-2017", "06-01-2018", 10000, 12000);
		
		
		Employee employee1 = new Employee (005,"Michael","Scolfield",657389823,10000.00,03,department1,location1,jobHistory1,region1);
		Employee employee2 = new Employee (005,"Michael","Scott",7652672,10000.00,03,department1,location1,jobHistory1,region1);
		
	
		
		
		//print the start date and end date : of employee - Michael
		
		//joining date of Michael 
		
//		JobHistory jobHistoryEmp1 = employee1.getJobHistory();
//		String startdate = jobHistoryEmp1.getStartDate();
//		String firstName = employee1.getFirstName();
//		System.out.println("Name = " + firstName + " : Startdate = " + startdate);
		
		
		System.out.println("Name = "+ employee1.getFirstName() 
		                   + " StartDate = " + employee1.getJobHistory().getStartDate());
																					//employee1.getJobHistory() => a Job History Object
																					//This Job History object is being used to call the getter method for startdate in JOB History Class
		
		
		
		System.out.println("Name = "+ employee1.getFirstName() 
        + " StartDate = " + employee1.getLocation().getStAdd());

		///Print the first name of employee 1 and the street address 
		
		
		
	}

}
