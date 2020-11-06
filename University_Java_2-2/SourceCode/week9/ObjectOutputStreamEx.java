package week9;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectOutputStreamEx {
	public static void main(String[] args)throws Exception {
		OutputStream out = new FileOutputStream("Person.txt");
		ObjectOutputStream oos = new ObjectOutputStream(out);

		Person p1 = new Person("��浿", 20, "1111-1111");
		Person p2 = new Person("�̱浿", 22, "2222-2222");
		Person p3 = new Person("Ȧ�浿", 33, "3333-3333");
		
		//��ü�� �����Ϸ��� ��Ʈ������ �ٲپ �����ؾ��Ѵ�.
		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.writeObject(p3);

		oos.close();
		oos.close();
	}
}
