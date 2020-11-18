package week12;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectInputStreamEx {
	public static void main(String[] args) throws Exception {
		InputStream in = new FileInputStream("Person.txt");
		BufferedInputStream bis = new BufferedInputStream(in);
		ObjectInputStream ois = new ObjectInputStream(bis);		
		
		Person p1 = (Person) ois.readObject();
		Person p2 = (Person) ois.readObject();
		Person p3 = (Person) ois.readObject();

		System.out.println("p1 : " + p1);
		System.out.println("p2 : " + p2);
		System.out.println("p3 : " + p3);

		ois.close();
		bis.close();
		in.close();
	}
}
