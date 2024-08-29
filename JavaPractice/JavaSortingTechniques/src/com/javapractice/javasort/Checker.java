package com.javapractice.javasort;

import java.util.Comparator;

public class Checker implements Comparator<Student> {

	@Override
	public int compare(Student a, Student b) {
		if (Double.compare(a.cgpa, b.cgpa) == 0) {
			if (a.studentName.compareTo(b.studentName) == 0) {
				return Integer.compare(a.studentId, b.studentId);
			} else {
				return a.studentName.compareTo(b.studentName);
			}
		} else {
			return Double.compare(b.cgpa, a.cgpa);
		}
	}
}
