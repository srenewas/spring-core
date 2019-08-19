package com.seenu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class address {
	@Value("3-234")
	String HouseNo;
	
	@Value("MNCL")
	String Area;
	
	@Value("HYDERABAD")
	String Village;
	
	@Value("TELANGANA")
	String State;
	
	public String getHouseNo() {
		return HouseNo;
	}
	public void setHouseNo(String houseNo) {
		HouseNo = houseNo;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	public String getVillage() {
		return Village;
	}
	public void setVillage(String village) {
		Village = village;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	@Override
	public String toString() {
		return "address [HouseNo=" + HouseNo + ", Area=" + Area + ", Village=" + Village + ", State=" + State + "]";
	}
	

}
