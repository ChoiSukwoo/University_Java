package week12;

import java.io.Serializable;

public class Person implements Serializable {

	private String name;
	private int age;
	private String ssn;

	public Person(String name, int age, String ssn) {
		this.name = name;
		this.age = age;
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return name + " : " + age + " : " + ssn;
	}

}