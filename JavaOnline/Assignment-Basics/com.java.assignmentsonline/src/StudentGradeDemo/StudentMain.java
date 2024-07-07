package StudentGradeDemo;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student name: ");
		String name = sc.nextLine();
		System.out.println("Enter the student id: ");
		int id = sc.nextInt();
		StudentDemo student = new StudentDemo(name, id);
		int[] marks = new int[5];
		for (int i = 0; i < 5; i++) {
			marks[i] = sc.nextInt();
		}
		student.getDetails();
		student.getGrades(marks);
		sc.close();
	}

}
