package com.steven.code1;
/*
 * java 默认首先调用父类的不带参数的构造方法，然后执行该构造方法生成父类的对象，接下来再调用之类的构造方法
 * 生成之类的对象，【要想生成之类的对象，首先要生成父类的对象，没有父类对象就没有子类对象，比如说：没有父亲就没有孩子
 * 
 */
public class InheritenceTest3
{
	public static void main(String[] args)
	{
		Son son = new Son();
	}
}

class Grandpa
{
	public Grandpa()
	{
		System.out.println("grandpa");
	}
}

class Father extends Grandpa
{
	public Father()
	{
		System.out.println("father");
	}
}

class Son extends Father
{
	public Son()
	{
		System.out.println("son");
	}
}


