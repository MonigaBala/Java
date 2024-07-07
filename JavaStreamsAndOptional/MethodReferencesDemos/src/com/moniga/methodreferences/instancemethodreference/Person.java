package com.moniga.methodreferences.instancemethodreference;

/**
 * Helper Class Person with private fields and initializing using constructors.
 * @author MonigaBalasubramanian
 * 
 */
public class Person {

	private Integer age;
	private String name;

	// Constructors to initialize the private members.
	public Person(Integer age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	// Getters and Setters for name, age.
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
