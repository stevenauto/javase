package com.steven.classloader;

import java.util.Random;

class FinalTest2
{
	/**不会输出FinalTest static block，因为x是一个编译时的常量，System.out.println(FinalTest.x);
	 * 不会导致类FinalTest被加载。
	 * Test3:public static final int x = new Random().nextInt(100);在运行时才能确定x是几，所以
	 * 会对class FinalTest2进行初始化。
	 * 也就是说如果x是一个编译时的常量他就对类初始化，如果不是常量就会对类初始化。
	 * 
	 */
	public static final int x = new Random().nextInt(100);
	
	static
	{
		System.out.println("FinalTest2 static block");
	}
}

public class StaticFinal2
{
	public static void main(String[] args)
	{
		System.out.println(FinalTest2.x);
	}
}
