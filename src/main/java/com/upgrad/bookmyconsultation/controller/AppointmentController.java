package com.upgrad.bookmyconsultation.controller;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.upgrad.bookmyconsultation.controller.ext.ResponseBuilder;
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
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;


	//create a method post method named bookAppointment with return type ReponseEntity
		//method has paramter of type Appointment, use RequestBody Annotation for mapping
	
		//save the appointment details to the database and save the response from the method used
		//return http response using ResponseEntity

	@PostMapping(path = {},
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity bookAppointment(@RequestHeader("authorization") String accessToken,
										  @RequestBody Appointment appointment) throws InvalidInputException {
		String appointmentResponse = appointmentService.appointment(appointment);
		return ResponseBuilder.ok()
				.payload(appointmentResponse)
				.build();
	}
	
	//create a get method named getAppointment with return type as ResponseEntity
		//method has appointmentId of type String. Use PathVariable annotation to identity appointment using the parameter defined
		
		//get the appointment details using the appointmentId
		//save the response
		//return the response as an http response
	
	@GetMapping(path="/{appointmentId}",
				produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity getAppointment(@RequestHeader("authorization") String accessToken,
													  @PathVariable String appointmentId){
		Appointment appointmentResponse = appointmentService.getAppointment(appointmentId);
		return ResponseBuilder.ok()
				.payload(appointmentResponse)
				.build();
	}
	

}