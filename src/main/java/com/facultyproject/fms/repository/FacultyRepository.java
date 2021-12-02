package com.facultyproject.fms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.facultyproject.fms.entity.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, Long>{
	

}
