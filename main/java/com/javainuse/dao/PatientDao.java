package com.javainuse.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.javainuse.model.Patient;

@Transactional
@Repository
public class PatientDao {
	@PersistenceContext
	private EntityManager entityManager;

	public List<Patient> getPatientList() {
		Date date =new Date();
		System.out.println("date ------------------------"+date);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String date1=sdf.format(date);
		Session session=entityManager.unwrap(Session.class);
		@SuppressWarnings("unchecked")
		List<Patient> patientlist=(List<Patient>) session.createCriteria(Patient.class)
		.add(Restrictions.sqlRestriction("CAST(pat_timestamp AS char) like '"+date1+"%'")).list();
		//.add(Restrictions.eq("CAST(pat_timestamp as String) ", date1)).list();
		return patientlist;
	} 
	public String addPatient(Patient patient) {
		Session session=entityManager.unwrap(Session.class);
		session.save(patient);
		return "";
	}
	
	public String updatePatient(Patient patient) {
		Session session=entityManager.unwrap(Session.class);
		session.update(patient);
		return "";
	}
	public Patient getPatientById(Patient patient) {
		Session session=entityManager.unwrap(Session.class);
		Patient patientdetail=(Patient) session.createCriteria(Patient.class)
				.add(Restrictions.eq("pat_id",patient.getPat_id())).uniqueResult();
		return patientdetail;
	}

}
