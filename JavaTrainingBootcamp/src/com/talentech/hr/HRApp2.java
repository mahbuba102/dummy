package com.talentech.hr;

public class HRApp2 {

	public static void main(String[] args) {
		
		Employee employeeMahbuba = new Employee (001,"Mahbuba","Nimme",674502345,1000.00, 02) ;
		Employee employeeEmon = new Employee (002,"Emon","Yusuf",674502945,2000.00, 04);
		
		Department departmentAccounting = new Department (1,"Accounting",2,3);
		Department departmentIT = new Department (2,"Information Technology", 3, 4);
		
		
//		System.out.println("Department Id is : "+departmentAccounting.departmentId );
//		System.out.println("Department Name is : "+ departmentAccounting.deprtamentName);
//		
//		
//		System.out.println("Department Id is : "+departmentIT.departmentId );
//		System.out.println("Department Name is : "+ departmentIT.deprtamentName);
//		
//		//departmentIT.departmentId = 5;
//		departmentIT.deprtamentName = "Sales";
//		
//		System.out.println("Department Id is : "+departmentIT.departmentId );
//		System.out.println("Department Name is : "+ departmentIT.deprtamentName);
//
	     int  departmentId = departmentIT.getDepartmentId();
	     String departName = departmentIT.getDepartmentName();
	     int managerId = departmentIT.getManagerId();
	     int locId = departmentIT.getLocationId();
	     
	     //System.out.println("DeptId = "+ departmentId + " , "+" DeptName = "+ departName+ " , "+ " ManagerId = " +managerId +" ,"+ "Location Id = "+ locId);
		 
	     System.out.println("Dept Id  = "+ departmentId);
	     System.out.println("DepartmentName = "+departName);
	     System.out.println("Manager Id  (Before) = "+ managerId);
	     System.out.println("Location Id (before) = "+locId);
	     
	     
	     
	     //change the manager id of IT department 
	     
	     departmentIT.setManagerId(4);
	     int managerIdAfter = departmentIT.getManagerId();
	     
	     departmentIT.setLocationId(6);
	     int locationIdAfter = departmentIT.getLocationId();

	     System.out.println("Manager Id (After)  = "+ managerIdAfter);

	     System.out.println("Location Id (After)  = "+ locationIdAfter);
	     

	}

}
