package com.steven.io;

public class Fibonacci
{
	//ʹ�õݹ����쳲���������
	public int compute(int n)
	{
		//�ݹ�ĳ���
		if(1 == n || 2 == n)
		{
			return 1;
		}
		else
		{
			return compute(n - 1) + compute(n - 2);
		}
	}
	
	public static void main(String[] args)
	{
		Fibonacci fab = new Fibonacci();
		
		System.out.println(fab.compute(9));
	}
}
