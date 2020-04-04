package com.javainuse.service;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javainuse.dao.PatientDao;
import com.javainuse.model.Patient;

@Service
public class PatientService {
	@Autowired
	private PatientDao patientDao;
	public List<Patient> getPatientList() {
    	return 	patientDao.getPatientList();
	} 
	public String addPatient(Patient patient) {
		return 	patientDao.addPatient(patient);
	}
	
	public String updatePatient(Patient patient){
		return 	patientDao.updatePatient(patient);
	}
	public Patient getPatientById(Patient patient){
		return 	patientDao.getPatientById(patient);
	}
	

}
