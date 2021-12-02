package com.facultyproject.fms.service;

import java.util.List;

import com.facultyproject.fms.entity.Faculty;

public interface FacultyService {
	List<Faculty> getAllFaculties();

	Faculty saveFaculty(Faculty faculty);

	Faculty getFacultyById(Long id);

	Faculty updateFaculty(Faculty faculty);

	void deleteFacultyById(Long id);
}
