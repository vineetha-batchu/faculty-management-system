package com.facultyproject.fms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.facultyproject.fms.entity.Faculty;
import com.facultyproject.fms.repository.FacultyRepository;

@SpringBootApplication
public class FacultyManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FacultyManagementSystemApplication.class, args);
	}

	@Autowired
	private FacultyRepository facultyRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Faculty faculty1= new Faculty("Vineetha","Batchu","Java","batchuvineetha@gmail.com");
//		facultyRepository.save(faculty1);
//		Faculty faculty2= new Faculty("Gayatri","Somi","Database","gayatris@gmail.com");
//		facultyRepository.save(faculty2);
//		Faculty faculty3= new Faculty("Sruthi","Bodala","Pega","sruthibodala@gmail.com");
//		facultyRepository.save(faculty3);

		
	}

	
}
