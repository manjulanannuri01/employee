package com.example.demo.entity;
import java.sql.Blob;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="employee")
@Component
public class EmployeeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long empId;
	private String empName;
	private String empSpouse ;
	private String empFatherName;
	private String empMotherName;
	private String empPhoneNumber;
	private String gender;
	private String address;
	private Blob image;
	
	
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpFatherName() {
		return empFatherName;
	}
	public void setEmpFatherName(String empFatherName) {
		this.empFatherName = empFatherName;
	}
	public String getEmpMotherName() {
		return empMotherName;
	}
	public void setEmpMotherName(String empMotherName) {
		this.empMotherName = empMotherName;
	}
	public String getEmpPhoneNumber() {
		return empPhoneNumber;
	}
	public void setEmpPhoneNumber(String empPhoneNumber) {
		this.empPhoneNumber = empPhoneNumber;
	}
	public String getEmpSpouse() {
		return empSpouse;
	}
	public void setEmpSpouse(String empSpouse) {
		this.empSpouse = empSpouse;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Blob getImage() {
		return image;
	}
	public void setImage(Blob image) {
		this.image = image;
	}
	
	
		
}


