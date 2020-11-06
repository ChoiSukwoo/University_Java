package week1;


class Student {
	private String name;
	private int age;
	public Student() {}
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name +  "-" + age;
	}
	
	public boolean equals(Student obj) {
		System.out.println("EqualsTest) this : " + this.toString() + "    obj : "  +obj.toString());
		return this.name.equals(obj.name) && this.age == obj.age;
	}
}

public class StudentEx {
	public static void main(String[] args) {
		Student student1  = new Student();
		Student student2 = new Student("È«µ¿",24);
		
		System.out.println("----------------------");
		System.out.println(student2);
		System.out.println("----------------------");
		System.out.println("student1 :" + student1.toString());
		System.out.println("student2 :" + student2.toString());
		
		Student student3 = new Student("¼Õ¸ª¹Î",26);
		System.out.println("student3 :" + student3.toString());
		
		Student student4 = new Student("È«±æµ¿",24);


		System.out.println(student2.equals(student3));
		System.out.println(student2.equals(student4));
		
	}
}





