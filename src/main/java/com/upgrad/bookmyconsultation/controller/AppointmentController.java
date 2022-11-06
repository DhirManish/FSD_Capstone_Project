package com.upgrad.bookmyconsultation.controller;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.upgrad.bookmyconsultation.entity.Appointment;
import com.upgrad.bookmyconsultation.exception.InvalidInputException;
import com.upgrad.bookmyconsultation.exception.SlotUnavailableException;
import com.upgrad.bookmyconsultation.service.AppointmentService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;


	//create a method post method named bookAppointment with return type ReponseEntity
		//method has paramter of type Appointment, use RequestBody Annotation for mapping
	
		//save the appointment details to the database and save the response from the method used
		//return http response using ResponseEntity
	
	@PostMapping
	public ResponseEntity<Appointment> bookAppointment(@RequestBody Appointment appointment) throws InvalidInputException{
		
		final Map<String, Appointment> DOCMAP = new HashMap<>();
		
		DOCMAP.put(appointment.getAppointmentId(), appointment);
		DOCMAP.put(appointment.getDoctorId(), appointment);
		DOCMAP.put(appointment.getDoctorName(), appointment);
		DOCMAP.put(appointment.getUserId(), appointment);
		DOCMAP.put(appointment.getUserName(), appointment);
		DOCMAP.put(appointment.getUserEmailId(), appointment);
		DOCMAP.put(appointment.getTimeSlot(), appointment);
		DOCMAP.put(appointment.getStatus(), appointment);
		DOCMAP.put(appointment.getAppointmentDate(), appointment);
		DOCMAP.put(appointment.getSymptoms(), appointment);
		DOCMAP.put(appointment.getPriorMedicalHistory(), appointment);
		
		return new ResponseEntity(appointment, HttpStatus.CREATED);
	}
	
	//create a get method named getAppointment with return type as ResponseEntity
		//method has appointmentId of type String. Use PathVariable annotation to identity appointment using the parameter defined
		
		//get the appointment details using the appointmentId
		//save the response
		//return the response as an http response
	
	@GetMapping(value="{appointmentsId}")
	public ResponseEntity<Appointment> getAppointment(@PathVariable String appointmentId){
		
		List<Appointment> appointment = appointmentService.getAppointmentsForUser(appointmentId);
		
		return new ResponseEntity(appointment, HttpStatus.OK);
		
	}
	

}