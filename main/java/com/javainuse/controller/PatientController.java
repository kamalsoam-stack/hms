package com.javainuse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.Patient;
import com.javainuse.service.PatientService;

@RestController
public class PatientController {
@Autowired
private PatientService patientservice;
	
	@PostMapping(path="/patientlist", produces = "application/json",consumes = "application/json")
	public List<Patient> getPatienList() {
		return patientservice.getPatientList();
	}
	@PostMapping(path="/addPatient", produces = "application/json",consumes = "application/json")
	public String addPatient(@RequestBody Patient patient) {
		return patientservice.addPatient(patient);
	}
	@PostMapping(path="/updatePatient", produces = "application/json",consumes = "application/json")
	public String updatePatient(@RequestBody Patient patient) {
		//add log table
		return patientservice.updatePatient(patient);
	}
	@PostMapping(path="/getPatientById", produces = "application/json",consumes = "application/json")
	public Patient getPatientById(@RequestBody Patient patient) {
		return patientservice.getPatientById(patient);
	}
	// delete method   soft delete 
	// log table(history) delete / update by timestamp  
	
	
	
}
