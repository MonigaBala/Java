package com.javapractice.javasort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortByCriteria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int n = sc.nextInt();
		List<Student> students = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the studentID: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the studentName: ");
			String name = sc.nextLine();
			System.out.println("Enter the studentCGPA: ");
			double cgpa = sc.nextDouble();
			students.add(new Student(id, name, cgpa));
		}

		Collections.sort(students, new Checker());

		for (Student student : students) {
			System.out.println(student.studentName);
		}
		sc.close();
	}

}
