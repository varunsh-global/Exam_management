package com.globallogic.mappings.entity;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="Course")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	
	@Column
	String name;
	
	@Column
	String Stream;
	
	public Course() {
		super();
	}

	public Course(long id, String name, String stream) {
		super();
		this.id = id;
		this.name = name;
		Stream = stream;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStream() {
		return Stream;
	}

	public void setStream(String stream) {
		Stream = stream;
	}
	
	
	
	
}
