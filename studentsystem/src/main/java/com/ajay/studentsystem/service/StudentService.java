package com.ajay.studentsystem.service;

import java.util.List;

import com.ajay.studentsystem.model.Student;

public interface StudentService {
	public Student saveStudent(Student student);
	public List<Student> getAllStudents();
}
