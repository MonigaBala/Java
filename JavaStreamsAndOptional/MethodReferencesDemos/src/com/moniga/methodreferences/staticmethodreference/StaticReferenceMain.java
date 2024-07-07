package com.moniga.methodreferences.staticmethodreference;

/**
 * Main class with Static method reference.
 * @author MonigaBalasubramanian
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StaticReferenceMain {

	// Static method to compare with age.
	public static int compareByAge(Person one, Person two) {

		return one.getAge().compareTo(two.getAge());
	}

	// Static method to compare with name.
	public static int compareByName(Person one, Person two) {

		return one.getName().compareTo(two.getName());
	}

	// Main method.
	public static void main(String[] args) {

		// Creating a List of type Person and the values are initialized according to
		// the constructor Person(Integer age, String name) .
		List<Person> personList = Arrays.asList((new Person(19, "Moniga")), (new Person(21, "Arun")),
				(new Person(40, "Murugeswari")), (new Person(46, "Bala")));

		// Using static method reference to sort array by age.
		Collections.sort(personList, StaticReferenceMain::compareByAge);

		System.out.println("Sort by age: ");
		personList.stream().map(x -> x.getName()).forEach(System.out::println);

		System.out.println();

		// Using static method reference to sort array by name.
		Collections.sort(personList, StaticReferenceMain::compareByName);

		System.out.println("Sort by name: ");
		personList.stream().map(x -> x.getName()).forEach(System.out::println);

	}
}
