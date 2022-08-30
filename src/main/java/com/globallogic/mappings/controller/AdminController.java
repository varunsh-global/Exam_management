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
import com.globallogic.mappings.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	AdminService  admn;
	
	@GetMapping("/")
	public List<Admin> getAdmin()
	{
		return admn.getAdmin();
	}
	
	@GetMapping("/names")
	public List<String> getstu()
	{
		return admn.getstu();
	}
	
	@PostMapping("/")
	public List<Admin> savedata(@RequestBody Admin ad) {
		return admn.savedata(ad);
	}
	@DeleteMapping("/{id}")
	public List<Admin> deleteadmn(@PathVariable("id") Long id)
	{
		return admn.deleteadmn(id);
	}
}
