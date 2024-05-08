package org.jsp.springboot_student_crud_app.repository;

import org.jsp.springboot_student_crud_app.dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Student_Repository extends JpaRepository<Student, Integer> {

	Student save(Student student);
}
