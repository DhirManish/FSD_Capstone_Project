package com.upgrad.bookmyconsultation.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {
	@Id
	private String appointmentId = UUID.randomUUID().toString();
	private String doctorId;
	private String doctorName;
	private String userId;
	private String userName;
	private String userEmailId;
	private String timeSlot;
	private String status;
	private String appointmentDate;
	@JsonIgnore
	private String createdDate;
	private String symptoms;
	private String priorMedicalHistory;
	
	
	public String getAppointmentId() {
		return appointmentId;
	}
	
	public void setAppointmentId() {
		this.appointmentId = appointmentId;
	}
	
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmailId() {
		return userEmailId;
	}
	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}
	public String getTimeSlot() {
		return timeSlot;
	}
	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public String getPriorMedicalHistory() {
		return priorMedicalHistory;
	}
	public void setPriorMedicalHistory(String priorMedicalHistory) {
		this.priorMedicalHistory = priorMedicalHistory;
	}
	
	

}
