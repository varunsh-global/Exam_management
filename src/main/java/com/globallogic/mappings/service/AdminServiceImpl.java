package com.globallogic.mappings.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globallogic.mappings.entity.Admin;
import com.globallogic.mappings.entity.Student;
import com.globallogic.mappings.repo.AdminRepo;
import com.globallogic.mappings.repo.*;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	AdminRepo repo;
	
	@Autowired
	StudentRepo sturepo;
	@Override
	public List<Admin> getAdmin() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	@Override
	public List<Admin> savedata(Admin ad) {
		// TODO Auto-generated method stub
		repo.save(ad);
		return repo.findAll();
	}
	@Override
	public List<Admin> deleteadmn(Long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return repo.findAll();
	}
	@Override
	public List<String> getstu() {
		// TODO Auto-generated method stub
		return sturepo.findByFirstname();
	}

}
