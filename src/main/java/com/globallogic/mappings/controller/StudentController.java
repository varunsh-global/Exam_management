package com.globallogic.mappings.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.mappings.entity.Student;
import com.globallogic.mappings.repo.StudentRepo;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentRepo StuRepo;
	@GetMapping("/")
	public List<Student> getstu()
	{
		return StuRepo.findAll();
	}
	
	@GetMapping("/name{name}")
	public List<Student> getbyname(@PathVariable("name") String name){
		return StuRepo.findByFirstname(name);
	}
	
	@PostMapping("/")
	public List<Student> savestu(@RequestBody Student stu)
	{
		StuRepo.save(stu);
		return StuRepo.findAll();
	}
	
	@PutMapping("/")
	public List<Student> updatestu(@RequestBody Student stu)
	{
		StuRepo.save(stu);
		return StuRepo.findAll();
	}
	
	@DeleteMapping("/{id}")
	public List<Student> deletestu(@PathVariable("id") Long id)
	{
		StuRepo.deleteById(id);
		return StuRepo.findAll();
	}
}
