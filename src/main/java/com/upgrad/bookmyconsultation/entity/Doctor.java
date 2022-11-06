package com.upgrad.bookmyconsultation.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.upgrad.bookmyconsultation.enums.Speciality;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.util.UUID;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Doctor {
	@Id
	private String id = UUID.randomUUID().toString();
	private String firstName;
	private String lastName;
	@Enumerated(EnumType.STRING)
	private Speciality speciality;
	private String dob;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private Address address;
	private String mobile;
	private String emailId;
	private String pan;
	private String highestQualification;
	private String college;
	private Integer totalYearsOfExp;
	private Double rating;
	
	public String getId() {
		return id;
	}
	
	public void SetId(String id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Speciality getSpeciality() {
		return speciality;
	}
	
	public void setSpeciality(Speciality speciality) {
		this.speciality = speciality;
	}
	
	public String getDob() {
		return dob;
	}
	
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getHighestQualification() {
		return highestQualification;
	}
	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public Integer getTotalYearsOfExp() {
		return totalYearsOfExp;
	}
	public void setTotalYearsOfExp(Integer totalYearsOfExp) {
		this.totalYearsOfExp = totalYearsOfExp;
	}
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}

}
