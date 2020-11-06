package week5;

import java.util.HashSet;

class Student {
	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//toString �������̵�
	public String toString() {
		return name + ":" + age;
	}

	//equals �������̵�
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student stu = (Student) obj;
			return this.name.equals(stu.name) && this.age == stu.age;
		}
		return false;
	}

	//hashCode �������̵�
	public int hashCode() {
		return (name + age).hashCode();
	}
}


//HashXXX Ŭ������ �����ϴ� �����ʹ� equl �Ӹ� �ƴ϶� hashCode() �޼��嵵 �������̵� ���־�� ���������� �۵��Ѵ�.
public class HashSetEx2 {
	public static void main(String[] args) {
		HashSet<Student> set = new HashSet<>();

		set.add(new Student("Kim", 20));
		set.add(new Student("Lee", 22));
		set.add(new Student("Kim", 20));
		set.add(new Student("Park", 22));

		Student stu1 = new Student("Moom", 22);
		Student stu2 = new Student("Kim", 20);
		Student stu3 = new Student("Kim", 20);

		System.out.println(stu1.hashCode());
		System.out.println(stu2.hashCode());
		System.out.println(stu3.hashCode());
		
		System.out.println(set);
	}

}
