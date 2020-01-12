package com.manikhweschool.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manikhweschool.model.Part;

@Repository
public interface PartRepository extends JpaRepository<Part, String>{
	
	public List<Part> findByPartNumberGreaterThan(byte partNumber);
	public List<Part> findByPartNumberLessThan(byte partNumber);
}
