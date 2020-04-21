package com.talentech.hr;

public class JobHistory {
	
	int empID;
	String startDate;
	String endDate;
	int startingSalary;
	int currentSalary;
	
	
	public JobHistory(int empID, String startDate, String endDate, int startingSalary, int currentSalary) {
		
		this.empID = empID;
		this.startDate = startDate;
		this.endDate = endDate;
		this.startingSalary = startingSalary;
		this.currentSalary = currentSalary;
	}
	
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public int getStartingSalary() {
		return startingSalary;
	}
	public void setStartingSalary(int startingSalary) {
		this.startingSalary = startingSalary;
	}
	public int getCurrentSalary() {
		return currentSalary;
	}
	public void setCurrentSalary(int currentSalary) {
		this.currentSalary = currentSalary;
	}

	
	
	
}
