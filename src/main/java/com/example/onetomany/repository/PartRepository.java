package com.example.onetomany.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.onetomany.model.Part;


public interface PartRepository extends JpaRepository<Part, Long> {
	
	
	@Query("SELECT p From Part p")
	List<Part>  printAllParts();
	
	

}
