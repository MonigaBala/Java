package com.javapractice.javasort;

public class Student {

	int studentId;
	String studentName;
	double cgpa;

	public Student() {
		super();
	}

	public Student(int studentId, String studentName, double cgpa) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.cgpa = cgpa;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", cgpa=" + cgpa + "]";
	}

}
