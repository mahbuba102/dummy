package com.talentech.hr;

public class Region {
	
	
	private int RegId;
	private String RegName;
	
	
	public Region(int RID, String RName){
		this.RegId=RID;
		this.RegName=RName;
	}


	public int getRegId() {
		return RegId;
	}


	public void setRegId(int regId) {
		RegId = regId;
	}


	public String getRegName() {
		return RegName;
	}


	public void setRegName(String regName) {
		RegName = regName;
	}
	



}
