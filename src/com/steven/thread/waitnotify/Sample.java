package com.steven.thread.waitnotify;

public class Sample
{
	private int number;

	public synchronized void increase()
	{
		/*必须用while，在用if的情况下，如果有二个decrease同时处于wait，increase执行完后
		 * notify，二个decrease会减到-1，所以必须在wait后再执行一次判断（视屏104）。
		 * 
		 * 
		 */
		while (0 != number)
		{
			try
			{
				wait();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}

		number++;

		System.out.println(number);

		notify();
	}

	public synchronized void decrease()
	{
		while (0 == number)
		{
			try
			{
				wait();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}

		number--;

		System.out.println(number);

		notify();
	}
}
