package com.pluralsight.repository;

import java.util.List;

import com.pluralsight.modal.Speaker;

public interface SpeakerRepository {

	List<Speaker> findAll();

}