package com.globallogic.mappings.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.globallogic.mappings.entity.*;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long>{
	@Query("select firstname from Student")
	public List<String> findByFirstname();
}
