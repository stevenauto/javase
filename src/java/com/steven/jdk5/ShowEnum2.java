package com.steven.jdk5;

public class ShowEnum2
{
	public static void main(String[] args)
	{
		for(OpConstant c : OpConstant.values())
		{
			//c.ordinal()��ʾ˳��0,1,2
			System.out.printf("%d, %s, %n", c.ordinal(), c);
		}
	}
}
