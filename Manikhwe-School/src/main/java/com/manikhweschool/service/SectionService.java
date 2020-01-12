package com.manikhweschool.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manikhweschool.dao.SectionRepository;

@Service
public class SectionService {

	@Autowired
	private SectionRepository repository;

	public SectionRepository getRepository() {
		return repository;
	}

	public void setRepository(SectionRepository repository) {
		this.repository = repository;
	}
}
