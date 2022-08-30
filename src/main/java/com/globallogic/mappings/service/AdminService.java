package com.globallogic.mappings.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.globallogic.mappings.entity.*;

@Service
public interface AdminService {

	public List<Admin> getAdmin();

	public List<Admin> savedata(Admin ad);

	public List<Admin> deleteadmn(Long id);

	public List<String> getstu();

}
