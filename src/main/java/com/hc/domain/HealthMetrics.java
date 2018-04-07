package com.hc.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HealthMetrics {

    @Id
	String aadhar;
	String hospitalName;
	String timeStamp;
	String latLong;
	String age;
	String gender;
	String state;
	String illness;
	
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getLatLong() {
		return latLong;
	}
	public void setLatLong(String latLong) {
		this.latLong = latLong;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getIllness() {
		return illness;
	}
	public void setIllness(String illness) {
		this.illness = illness;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HealthMetrics [aadhar=");
		builder.append(aadhar);
		builder.append(", hospitalName=");
		builder.append(hospitalName);
		builder.append(", TimeStamp=");
		builder.append(timeStamp);
		builder.append(", latLong=");
		builder.append(latLong);
		builder.append(", age=");
		builder.append(age);
		builder.append(", gender=");
		builder.append(gender);
		builder.append(", state=");
		builder.append(state);
		builder.append(", illness=");
		builder.append(illness);
		builder.append("]");
		return builder.toString();
	}
	public HealthMetrics() {
		super();
	}
	public HealthMetrics(String aadhar, String hospitalName, String timeStamp, String latLong, String age,
			String gender, String state, String illness) {
		super();
		this.aadhar = aadhar;
		this.hospitalName = hospitalName;
		this.timeStamp = timeStamp;
		this.latLong = latLong;
		this.age = age;
		this.gender = gender;
		this.state = state;
		this.illness = illness;
	}
	
}
