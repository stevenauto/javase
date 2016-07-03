package com.steven.code22.classloader;
/**输出结果是counter1 = 1，count2 =0；
 * 步骤是：1给静态变量赋值（默认值），singleton=null,counter1=0,counter2=0。
 * 2 初始化，从上到下，new Singleton（），执行结果是counter1=1;counter2=1;(在构造方法中实现）。
 * 然后没有改变counter1的值，但是对counter2赋值，所有counter2等于0；
 * 如果将private static Singleton singleton = new Singleton();放在public static int counter2 = 0;
 * 后那么输出结果是counter1 = 1，count2 =1；
 * 
 * @author aruba
 *
 */

class Singleton
{
	private static Singleton singleton = new Singleton();
	public static int counter1;
	public static int counter2 = 0;//(这个0不是第一步的初始值)
	
	private Singleton()
	{
		counter1++;
		counter2++;
	}
	public static Singleton getInstance()
	{
		return singleton;
	}
}
public class MyTest
{
	public static void main(String[] args)
	{
		Singleton singleton = Singleton.getInstance();//调用类的静态方法（主动使用）会导致类的加载
		System.out.println("counter1 = " + singleton.counter1);
		System.out.println("counter2 = " + singleton.counter2);
	}
}

















