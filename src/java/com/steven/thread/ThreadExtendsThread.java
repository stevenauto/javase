package com.steven.thread;
/*Thread 类也实现了runable接口
 * 
 */
public class ThreadExtendsThread
{
	public static void main(String[] args)
	{
		//"first thread"为线程的名字。
		Thread1 t1 = new Thread1("first thread");
		Thread1 t2 = new Thread1("second thread");
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		t1.start();
		t2.start();
	}
}

class Thread1 extends Thread
{
	public Thread1(String name)
	{
		super(name);
	}
	
	@Override
	public void run()
	{
		for(int i = 0; i < 100; i++)
		{
			System.out.println("hello world: " + i);
		}
	}
}

class Thread2 extends Thread
{
	public Thread2(String name)
	{
		super(name);
	}
	
	@Override
	public void run()
	{
		for(int i = 0; i < 100; i++)
		{
			System.out.println("welcome: " + i);
		}
	}
}

















