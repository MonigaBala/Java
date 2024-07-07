package com.moniga.methodreferences.instancemethodreference;

import java.util.Comparator;

public class CompareByAge implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {

		return o1.getAge().compareTo(o2.getAge());
	}

}
