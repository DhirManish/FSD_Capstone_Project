package com.upgrad.bookmyconsultation.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;


//Mark it with Data, Entity, Builder, NoArgsConstructor, AllArgsConstructor
//create a class named User
//create firstName of type String
//create lastName of type String
//create dob of type String
//create mobile of type String
//create primary key 'emailId' of type String
//create password of type String
//create createdDate of type String
//create salt of type String
//all the mentioned members must be private
@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
	@Id
	@Column(name = "email_id", nullable = false)
	@NotBlank(message = "Email is mandatory")
	private String emailId;
	@Column(name = "created_date")
	private String createdDate = LocalDate.now().toString();
	private String dob;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	private String mobile;
	@NotBlank(message = "Password is mandatory")
	private String password;
	private String salt;
}