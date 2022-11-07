package com.upgrad.bookmyconsultation.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.UUID;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {

	/*@Id
	@Column(name="appointment_id")
	private String appointmentId = UUID.randomUUID().toString();

	@Column(name="doctor_id")
	private String doctorId;

	@Column(name="doctor_name")
	private String doctorName;

	@Column(name="user_id")
	private String userId;

	@Column(name="user_name")
	private String userName;

	@Column(name="user_email_id")
	private String userEmailId;

	@Column(name="time_slot")
	private String timeSlot;

	@Column(name="status")
	private String status;

	@Column(name="appointment_date")
	private String appointmentDate;

	@JsonIgnore
	@Column(name="created_date")
	private String createdDate = LocalDate.now().toString();;

	@Column(name="symptoms")
	private String symptoms;

	@Column(name="prior_medical_history")
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
	
	*/

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

}
