package org.logicalfreaks.starter.entity;

import java.util.Date;

public class Student {
	
	private int id;
	private String studentId;
	private String firstName;
	private String lastName;
	private String nameAsPerGovtRecords;
	private String fatherName;
	private Date dateOfJoining;
	private Date dateOfLeaving;
	private int age;
	private String gender;
	
	public Student()
	{
		
	}
	
	public Student(int id, String studentId, String firstName, String lastName, String nameAsPerGovtRecords,
			String fatherName, Date dateOfJoining, Date dateOfLeaving, int age, String gender) {
		super();
		this.id = id;
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nameAsPerGovtRecords = nameAsPerGovtRecords;
		this.fatherName = fatherName;
		this.dateOfJoining = dateOfJoining;
		this.dateOfLeaving = dateOfLeaving;
		this.age = age;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNameAsPerGovtRecords() {
		return nameAsPerGovtRecords;
	}
	public void setNameAsPerGovtRecords(String nameAsPerGovtRecords) {
		this.nameAsPerGovtRecords = nameAsPerGovtRecords;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public Date getDateOfLeaving() {
		return dateOfLeaving;
	}
	public void setDateOfLeaving(Date dateOfLeaving) {
		this.dateOfLeaving = dateOfLeaving;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	

}
