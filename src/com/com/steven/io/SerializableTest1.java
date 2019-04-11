package com.steven.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/*
 * ObjectOutputStream implements dataoutputstream
 */
public class SerializableTest1
{
	public static void main(String[] args) throws Exception
	{
		Personal p1 = new Personal(20, "zhangsan", 4.55);
		Personal p2 = new Personal(50, "lisi", 4.67);
		Personal p3 = new Personal(10, "wangwu", 17.78);

		FileOutputStream fos = new FileOutputStream("Personal.txt");

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.writeObject(p3);

		oos.close();

		System.out.println("--------------------");

		FileInputStream fis = new FileInputStream("Personal.txt");

		ObjectInputStream ois = new ObjectInputStream(fis);

		Personal p = null;

		for (int i = 0; i < 3; i++)
		{
			p = (Personal) ois.readObject();

			System.out.println(p.age + "," + p.name + "," + p.height);
		}

		ois.close();
	}
}

class Personal implements Serializable
{
	int age;

	String name;
	

	double height;

	public Personal(int age, String name, double height)
	{
		this.age = age;
		this.name = name;
		this.height = height;
	}
}
