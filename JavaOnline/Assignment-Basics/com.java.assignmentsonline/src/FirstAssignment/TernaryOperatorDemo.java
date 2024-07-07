package FirstAssignment;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = 80;

		int Greatest = (x > y && x > z ? x : (y > z ? y : z));
		System.out.println(Greatest);
	}

}
