package week3;

class Person{}
class Student extends Person{}
class Researcher extends Student{}
class Professor extends Researcher{}

public class InstanceOfEx {
	static void Print(Person p) {
		if (p instanceof Person) {
			System.out.print("Person");
		}
		if (p instanceof Student) {
			System.out.print("Student");
		}
		if (p instanceof Researcher) {
			System.out.print("Researcher");
		}
		if (p instanceof Professor) {
			System.out.print("Professor");
		}
	}
	public static void main(String[] args) {
		System.out.print("new student() ->> \t"); Print(new Student());
	//	System.out.print("\n");
		System.out.print("new Professor() ->> \t"); Print(new Professor());
		
		Student stu = new Student();
		if(stu instanceof Student) {
			System.out.println("stu´Â StudentÅ¸ÀÔ");
		}
	}
}
