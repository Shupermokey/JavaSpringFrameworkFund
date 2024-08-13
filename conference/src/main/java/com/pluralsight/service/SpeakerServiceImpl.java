package com.pluralsight.service;

import java.util.List;

import com.pluralsight.modal.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {
	
	private SpeakerRepository repo = new HibernateSpeakerRepositoryImpl();
	
	@Override
	public List<Speaker> findAll() {
		
		return repo.findAll();
		
	}

}
