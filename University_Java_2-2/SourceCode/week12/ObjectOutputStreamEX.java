package week12;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class ObjectOutputStreamEX {
	public static void main(String[] args) throws Exception {
		OutputStream out = new FileOutputStream("Person.txt");
		BufferedOutputStream bos= new BufferedOutputStream(out);
		ObjectOutputStream oos = new ObjectOutputStream(bos);

		Person p1 = new Person("Kim",20,"111-1111");
		Person p2 = new Person("Lee",22,"222-2222");
		Person p3 = new Person("park",23,"333-3333");

		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.writeObject(p3);
		
		oos.close();
		bos.close();
		out.close();
	}
}
