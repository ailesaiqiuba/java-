package com.io;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class Serializable_test {



	public static void main(String[] args) throws IOException, Exception {
		E718_person p1=new E718_person(30,"mike");
		FileOutputStream fOut=new FileOutputStream("person.txt");
		ObjectOutputStream obj=new ObjectOutputStream(fOut);
		obj.writeObject(p1);
		
		
		
		ObjectInputStream oin=new ObjectInputStream(new FileInputStream("person.txt"));
		E718_person p= (E718_person) oin.readObject();
		System.out.println(p);

	}

}
