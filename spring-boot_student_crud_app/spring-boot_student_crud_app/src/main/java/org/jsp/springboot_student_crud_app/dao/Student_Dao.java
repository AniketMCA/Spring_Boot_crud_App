package org.jsp.springboot_student_crud_app.dao;

import java.util.Optional;

import org.jsp.springboot_student_crud_app.dto.Student;
import org.jsp.springboot_student_crud_app.repository.Student_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Student_Dao {
	@Autowired
	private Student_Repository repository; 
	
	public Student saveStudent(Student student) {
		return repository.save(student);
	}
	
	public Optional<Student> findById(int roll_no) {
		return repository.findById(roll_no); 
	}
	
	public void updateById(int roll_no,Student student) {
		student.setRoll_no(roll_no);
		repository.save(student);
	}
	
	public void deleteById(int roll_no) {
		repository.deleteById(roll_no);
	}
}
