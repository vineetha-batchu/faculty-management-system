package com.facultyproject.fms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.facultyproject.fms.entity.Faculty;
import com.facultyproject.fms.service.FacultyService;

@Controller
public class FacultyController {
	private FacultyService facultyService;

	public FacultyController(FacultyService facultyService) {
		//super();
		this.facultyService = facultyService;
	}
	
	//handler method to handle list faculties and return model and view
	@GetMapping("/faculties")
	public String listFaculties(Model model) {
		model.addAttribute("faculties",facultyService.getAllFaculties());
		return "faculties";
		
	}
	@GetMapping("/faculties/new")
	public String createFacultyForm(Model model) {
		
		//creating faculty object for holding data
		Faculty faculty=new  Faculty();
		model.addAttribute("faculty",faculty);
		return "create_faculty";
	}
	@PostMapping("/faculties")
	public String saveFaculty(@ModelAttribute("faculty") Faculty faculty) {
		facultyService.saveFaculty(faculty);
		return "redirect:/faculties";
	}
	@GetMapping("/faculties/edit/{id}")
	public String editFacultyForm(@PathVariable Long id, Model model) {
		model.addAttribute("faculty", facultyService.getFacultyById(id));
		return "edit_faculty";
	}
	
	@PostMapping("/faculties/{id}")
	public String updateFaculty(@PathVariable Long id,
			@ModelAttribute("faculty") Faculty faculty,
			Model model) {
		
		// get faculty from database by id
		Faculty existingFaculty = facultyService.getFacultyById(id);
		existingFaculty.setId(id);
		existingFaculty.setFirstName(faculty.getFirstName());
		existingFaculty.setLastName(faculty.getLastName());
		existingFaculty.setCourseName(faculty.getCourseName());
		existingFaculty.setEmail(faculty.getEmail());
		
		// save updated faculty object
		facultyService.updateFaculty(existingFaculty);
		return "redirect:/faculties";		
	}
	// handler method to handle delete patient request
	
		@GetMapping("/faculties/{id}")
		public String deleteFaculty(@PathVariable Long id) {
			facultyService.deleteFacultyById(id);
			return "redirect:/faculties";
		}
	

}
