package com.globallogic.mappings.entity;


import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Exam")
public class Exam {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	
	@Column
	long e_code;
	
	@Column
	String name;
	
	@Column
	String Course;
	
	@Column
	String Stream;

	public Exam() {
		super();
	}

	public Exam(long id, long e_code, String name, String course, String stream) {
		super();
		this.id = id;
		this.e_code = e_code;
		this.name = name;
		Course = course;
		Stream = stream;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getE_code() {
		return e_code;
	}

	public void setE_code(long e_code) {
		this.e_code = e_code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	public String getStream() {
		return Stream;
	}

	public void setStream(String stream) {
		Stream = stream;
	}
	
}
