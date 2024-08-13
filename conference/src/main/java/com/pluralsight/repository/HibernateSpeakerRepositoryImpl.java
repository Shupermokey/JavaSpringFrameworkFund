package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.modal.Speaker;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

	@Override
	public List<Speaker> findAll() {
		List<Speaker> speakers = new ArrayList<>();
		Speaker speaker = new Speaker();
		speaker.setFirstName("Alex");
		speaker.setLastName("Sobieraj");
		
		speakers.add(speaker);
		
		return speakers;
	}
	
}
