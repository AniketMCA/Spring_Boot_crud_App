package org.jsp.springboot_student_crud_app.service;

import java.util.Optional;

import org.jsp.springboot_student_crud_app.dao.Student_Dao;
import org.jsp.springboot_student_crud_app.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Student_Service {
	@Autowired
	private Student_Dao dao;
	
	public Student saveStudent(Student student) {
		return dao.saveStudent(student);
	}
		
	public Optional<Student> findById(int roll_no) {
		return dao.findById(roll_no);
	}
	
	public void updateById(int roll_no,Student student) {
		dao.updateById(roll_no, student);
	}
	
	public void deleteById(int roll_no) {
		dao.deleteById(roll_no);
	}
}
