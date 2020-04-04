package com.javainuse.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "patient")
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long pat_id;
	
	@Column(name="PAT_FNAME")
	private String pat_fname;
	@Column(name="PAT_NAME")
	private String pat_name;
    @Column(name="PAT_AGE")
    private Integer pat_age;
    @Column(name="PAT_FATH_NAME")	
    private String pat_father_name;
    @Column(name="PAT_ADDR")
    private String pat_address;
    @Column(name="PAT_MOTH_NAME")
    private String pat_mother_name;
    @Column(name="PAT_DELETED")
    private String pat_deleted;
    @Column(name="PAT_CITY")	
	private String pat_city;
    @Column (name="PAT_TIMESTAMP")
    private Timestamp pat_timestamp;
	public long getPat_id() {
		return pat_id;
	}
	public void setPat_id(long pat_id) {
		this.pat_id = pat_id;
	}
	public String getPat_fname() {
		return pat_fname;
	}
	public void setPat_fname(String pat_fname) {
		this.pat_fname = pat_fname;
	}
	public String getPat_name() {
		return pat_name;
	}
	public void setPat_name(String pat_name) {
		this.pat_name = pat_name;
	}
	public Integer getPat_age() {
		return pat_age;
	}
	public void setPat_age(Integer pat_age) {
		this.pat_age = pat_age;
	}
	public String getPat_father_name() {
		return pat_father_name;
	}
	public void setPat_father_name(String pat_father_name) {
		this.pat_father_name = pat_father_name;
	}
	public String getPat_address() {
		return pat_address;
	}
	public void setPat_address(String pat_address) {
		this.pat_address = pat_address;
	}
	public String getPat_mother_name() {
		return pat_mother_name;
	}
	public void setPat_mother_name(String pat_mother_name) {
		this.pat_mother_name = pat_mother_name;
	}
	public String getPat_deleted() {
		return pat_deleted;
	}
	public void setPat_deleted(String pat_deleted) {
		this.pat_deleted = pat_deleted;
	}
	public String getPat_city() {
		return pat_city;
	}
	public void setPat_city(String pat_city) {
		this.pat_city = pat_city;
	}
    
    
    
}
