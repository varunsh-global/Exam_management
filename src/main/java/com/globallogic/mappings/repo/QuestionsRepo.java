package com.globallogic.mappings.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.globallogic.mappings.entity.*;

@Repository
public interface QuestionsRepo extends JpaRepository<Questions,Long>{

}