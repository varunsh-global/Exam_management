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

import com.globallogic.mappings.entity.*;
import com.globallogic.mappings.repo.*;

@RestController
@RequestMapping("/staff")
public class StaffController {
	@Autowired
	StaffRepo StaffRepo;
	@GetMapping("/")
	public List<Staff> getstu()
	{
		return StaffRepo.findAll();
	}
	
	//@GetMapping("/name{name}")
	//public List<Staff> getbyname(@PathVariable("name") String firstname){
		//return StaffRepo.findByFirstname(firstname);
	//}
	
	@PostMapping("/")
	public List<Staff> savestu(@RequestBody Staff staff)
	{
		StaffRepo.save(staff);
		return StaffRepo.findAll();
	}
	
	@PutMapping("/")
	public List<Staff> updatestu(@RequestBody Staff staff)
	{
		StaffRepo.save(staff);
		return StaffRepo.findAll();
	}
	
	@DeleteMapping("/{id}")
	public List<Staff> deletestu(@PathVariable("id") Long id)
	{
		StaffRepo.deleteById(id);
		return StaffRepo.findAll();
	}
}
