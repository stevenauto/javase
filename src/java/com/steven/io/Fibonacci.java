package com.steven.io;

public class Fibonacci
{
	//使用递归计算斐波纳契数列
	public int compute(int n)
	{
		//递归的出口
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
