package com.talentech.hr;

public class HRApp {


	public static void main(String[] args) {

		
		Department departmentAccounting = new Department (1,"Accounting",2,3);
		Department departmentIT = new Department (2,"Information Technology", 3, 4);
		
		
		Employee employeeMahbuba = new Employee (001,"Mahbuba","Nimme",674502345,1000.00, 02,departmentAccounting) ;
		Employee employeeEmon = new Employee (002,"Emon","Yusuf",674502945,2000.00, 04,departmentIT);
		
		
        System.out.println("Employee First Name : "+ employeeMahbuba.getFirstName());
        
        Department department = employeeMahbuba.getDepartment();
        String departmentName = department.getDepartmentName();
        
        System.out.println(" Employee Department : "+departmentName );

	}

}
