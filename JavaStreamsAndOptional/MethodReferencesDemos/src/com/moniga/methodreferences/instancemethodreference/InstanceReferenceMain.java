package com.moniga.methodreferences.instancemethodreference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InstanceReferenceMain {

	public static void main(String[] args) {

		List<Person> personList = Arrays.asList((new Person(25, "Ram")), (new Person(24, "Sam")),
				(new Person(26, "Tom")), (new Person(42, "Ravi")));

		CompareByAge ageReference = new CompareByAge();
		Collections.sort(personList, ageReference);

		System.out.println("Sort by age: ");
		personList.stream().map(x -> x.getName()).forEach(System.out::println);
		System.out.println();

		CompareByName nameReference = new CompareByName();
		Collections.sort(personList, nameReference);

		System.out.println("Sort by name: ");
		personList.stream().map(x -> x.getName()).forEach(System.out::println);
		System.out.println();

	}

}
