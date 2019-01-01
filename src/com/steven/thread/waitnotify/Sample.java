package com.steven.thread.waitnotify;

public class Sample
{
	private int number;

	public synchronized void increase()
	{
		/*������while������if������£�����ж���decreaseͬʱ����wait��increaseִ�����
		 * notify������decrease�����-1�����Ա�����wait����ִ��һ���жϣ�����104����
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
