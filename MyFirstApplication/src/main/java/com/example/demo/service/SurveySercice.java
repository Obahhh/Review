package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Survey;

public interface SurveySercice {
	
	void save(Survey survey);
	
	List<Survey> getAll();

}
