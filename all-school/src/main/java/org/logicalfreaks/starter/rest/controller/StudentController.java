package org.logicalfreaks.starter.rest.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.logicalfreaks.starter.entity.Student;
import org.logicalfreaks.starter.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/hello")
	public String sayHelloStudent()
	{
		return "Hello Student";
	}
	
	@RequestMapping("/students")
	public List<Student> getAllStudents()
	{
		return studentService.getAllStudents();
	}
	
	
	@RequestMapping("/student/{id}")
	public Student getStudentById(@PathVariable int id)
	{
		return studentService.getStudentById(id);
	}

}
