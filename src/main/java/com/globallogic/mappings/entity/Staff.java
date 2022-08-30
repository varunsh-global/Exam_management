package com.globallogic.mappings.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Staff")
public class Staff {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	
	@Column
	String username;
	
	@Column
	String password;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Student> student;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Questions> questions;

	public Staff() {
		super();
	}

	public Staff(long id, String username, String password, List<Student> student, List<Questions> questions) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.student = student;
		this.questions = questions;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public List<Questions> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Questions> questions) {
		this.questions = questions;
	}
	
	
}

