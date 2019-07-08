package org.logicalfreaks.starter.service;

import java.util.ArrayList;
import java.util.List;

import org.logicalfreaks.starter.entity.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	List<Student> studentList=new ArrayList<Student>();
	
	public List<Student> getAllStudents()
	{

		
		Student s1=new Student();
		s1.setId(1);
		s1.setFirstName("Hemanth");
		s1.setLastName("Pasupuleti");
		s1.setNameAsPerGovtRecords("Pasupuleti Hemanth");
		s1.setFatherName("Madan Mohan");
		s1.setGender("M");
		
		studentList.add(s1);
		
		Student s2=new Student();
		s2.setId(2);
		s2.setFirstName("Kavitha");
		s2.setLastName("Pasupuleti");
		s2.setNameAsPerGovtRecords("Pasupuleti Kavitha");
		s2.setFatherName("Koteshwara Rao");
		s2.setGender("F");
		
		studentList.add(s2);
		
		return studentList;
	}

	public Student getStudentById(int id) {
		
		return studentList.stream().filter(t -> t.getId()==id).findFirst().get();
	}

}
