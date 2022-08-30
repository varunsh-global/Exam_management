package com.globallogic.mappings.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.globallogic.mappings.entity.*;

@Repository
public interface StaffRepo extends JpaRepository<Staff,Long>{
	
	//public List<Student> findByName(String name);
}
