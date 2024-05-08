package org.jsp.springboot_student_crud_app.controller;

import java.util.Optional;

import org.jsp.springboot_student_crud_app.dto.Student;
import org.jsp.springboot_student_crud_app.service.Student_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student_Controller {
	@Autowired
	private Student_Service service;
	
	@PostMapping("/save/student")
	public void saveStudent(@RequestBody Student student) {
		service.saveStudent(student);
	}
	
	@GetMapping("/find/student/{id}")
	public Optional<Student> findById(@PathVariable int roll_no) {
		return service.findById(roll_no);
	}
	
	@PutMapping("/update/student/{id}")
	public void updateById(@PathVariable int roll_no,@RequestBody Student student) {
		service.updateById(roll_no, student);
	}
	
	@PutMapping("/delete/student/{id}")
	public void deleteById(@PathVariable int roll_no) {
		service.deleteById(roll_no);
	}
}
