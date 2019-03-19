package com.steven.pattern.singleton;

public class SingletonThread
{
	private static SingletonThread singleton;
	
	private SingletonThread()
	{

	}

	public static SingletonThread getInstance()
	{
		if (null == singleton)
		{
			try
			{
				Thread.sleep((long) (Math.random() * 4000));
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}

			singleton = new SingletonThread();
		}

		return singleton;
	}

	public static void main(String[] args)
	{
		new MyThread().start();
		new MyThread().start();

	}

}

class MyThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println(SingletonThread.getInstance());
	}
}


























