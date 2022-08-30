package com.globallogic.mappings.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.util.List;

import javax.persistence.*;
import javax.persistence.Table;


@Entity
@Table(name="Admin")
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	
	@Column
	String username;
	
	@Column
	String password;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Staff> staff;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Student> student;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Course> course;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Exam> exam;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Questions> questions;

	public Admin() {
		super();
	}

	public Admin(long id, String username, String password, List<Staff> staff, List<Student> student,
			List<Course> course, List<Exam> exam, List<Questions> questions) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.staff = staff;
		this.student = student;
		this.course = course;
		this.exam = exam;
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

	public List<Staff> getStaff() {
		return staff;
	}

	public void setStaff(List<Staff> staff) {
		this.staff = staff;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	public List<Exam> getExam() {
		return exam;
	}

	public void setExam(List<Exam> exam) {
		this.exam = exam;
	}

	public List<Questions> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Questions> questions) {
		this.questions = questions;
	}
	
	
}
