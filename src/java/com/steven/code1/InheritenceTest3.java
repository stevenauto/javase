package com.steven.code1;
/*
 * java Ĭ�����ȵ��ø���Ĳ��������Ĺ��췽����Ȼ��ִ�иù��췽�����ɸ���Ķ��󣬽������ٵ���֮��Ĺ��췽��
 * ����֮��Ķ��󣬡�Ҫ������֮��Ķ�������Ҫ���ɸ���Ķ���û�и�������û��������󣬱���˵��û�и��׾�û�к���
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


