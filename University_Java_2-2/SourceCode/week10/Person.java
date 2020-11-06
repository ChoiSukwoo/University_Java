package week10;

import java.io.Serializable;

//��ü�� �����ϱ����� ����ȭ ���Ѿ���
public class Person implements Serializable {

	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + ":" + age;
	}

	@Override
	public boolean equals(Object obj) {
		Person person = (Person) obj;
		return this.name.equals(person.name) && this.age == person.age;
	}

	@Override
	public int hashCode() {
		return (name + age).hashCode();
	}

}
