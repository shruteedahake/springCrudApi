package com.hexaware.webex.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Student {
	@Id
	int rollNo;
	
	@NotEmpty
	String name;
	
	@Pattern(regexp="^[0-9] {6}$")
	Double fee;
	
	@Min(value=18, message="Age cannnot be less than 18")
	@Max(value=60, message="Age cannot be greater than 60")
	int age;
	
	@Email
	String email;
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	@Size(min=10, max=50)
	String address;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	Student(){
		
	}
	
	public Student(int rollNo, String name, Double fee) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.fee = fee;
	}

	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getFee() {
		return fee;
	}
	public void setFee(Double fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", fee=" + fee + ", age=" + age + ", email=" + email + ", address=" + address + "]";
	}
	
}
