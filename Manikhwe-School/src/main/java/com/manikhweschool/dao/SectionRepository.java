package com.manikhweschool.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manikhweschool.model.Section;

@Repository
public interface SectionRepository extends JpaRepository<Section, String>{

}
