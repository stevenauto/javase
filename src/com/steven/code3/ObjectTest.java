package com.steven.code3;
public class ObjectTest
{
	public static void main(String[] args)
	{
		Object object = new Object();

		System.out.println(object);
		System.out.println(object.toString());

		String str = "aaa";

		System.out.println(str);
		System.out.println(str.toString());

		Students student = new Students();

		System.out.println(student);
		System.out.println(student.toString());

	}
}

class Students extends Object
{
	public String toString()
	{
		return "Hello World";
	}
}


