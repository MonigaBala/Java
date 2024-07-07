package StudentGradeDemo;

public class StudentDemo {
	private String name;
	private int studentId;

	public StudentDemo(String name, int studentId) {
		super();
		this.name = name;
		this.studentId = studentId;
	}

	public void getDetails() {
		System.out.println("Student name: " + name);
		System.out.println("Student ID: " + studentId);

	}

	public void getGrades(int[] marks) {
		int sum = 0;
		for (int ele : marks) {
			sum += ele;
		}
		double average = 0.0;
		average = sum / marks.length;
		if (average > 0 && average <= 20) {
			System.out.println("Grade is 'C'");
		} else if (average > 20 && average < 40) {
			System.out.println("Grade is 'B'");
		} else {
			System.out.println("Grade is 'A'");
		}

	}
}
