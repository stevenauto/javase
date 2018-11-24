package com.steven.code2;

public class FinalTest4
{
	final int a;

	public FinalTest4()
	{
		a = 0;
	}

	public FinalTest4(int a)
	{
		this.a = a;
	}
	public static void main(String [] args){
		
		FinalTest4 f4 = new FinalTest4();
		System.out.println(f4.a);
	}
}
