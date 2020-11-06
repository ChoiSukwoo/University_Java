package week5;

import java.util.HashSet;

class Student {
	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//toString 오버라이딩
	public String toString() {
		return name + ":" + age;
	}

	//equals 오버라이딩
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student stu = (Student) obj;
			return this.name.equals(stu.name) && this.age == stu.age;
		}
		return false;
	}

	//hashCode 오버라이딩
	public int hashCode() {
		return (name + age).hashCode();
	}
}


//HashXXX 클래스에 저장하는 데이터는 equl 뿐만 아니라 hashCode() 메서드도 오버라이딩 해주어야 정상적으로 작동한다.
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
