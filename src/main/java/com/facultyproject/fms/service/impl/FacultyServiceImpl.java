package com.facultyproject.fms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.facultyproject.fms.entity.Faculty;
import com.facultyproject.fms.repository.FacultyRepository;
import com.facultyproject.fms.service.FacultyService;

@Service
public class FacultyServiceImpl implements FacultyService{
	
	private FacultyRepository facultyRepository;
	

	public FacultyServiceImpl(FacultyRepository facultyrepository) {
		super();
		this.facultyRepository = facultyrepository;
	}

	@Override
	public List<Faculty> getAllFaculties() {
		return facultyRepository.findAll();
	}

	@Override
	public Faculty saveFaculty(Faculty faculty) {
		// TODO Auto-generated method stub
		return facultyRepository.save(faculty);
	}

	@Override
	public Faculty getFacultyById(Long id) {
		// TODO Auto-generated method stub
		return facultyRepository.findById(id).get();
	}

	@Override
	public Faculty updateFaculty(Faculty faculty) {
		// TODO Auto-generated method stub
		return facultyRepository.save(faculty);
	}

	@Override
	public void deleteFacultyById(Long id) {
		// TODO Auto-generated method stub
		facultyRepository.deleteById(id);
	}
	
	
	

}
