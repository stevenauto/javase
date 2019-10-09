package com.steven.thread;

public class ThreadMemberLocalVar
{
	public static void main(String[] args)
	{
		Runnable r = new HelloThread();
		
		Thread t1 = new Thread(r);
		//如果是二个runnable方法就会打印100个，因为有二个hellothread对象。
		//r = new HelloThread();
		
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
	}
}

class HelloThread implements Runnable
{
	/*因为只有一个对象，int i是成员变量，所以二个线程共享一个成员变量。也就是说虽然有二个线程但是他们访问的是
	 * 同一个对象的成员变量i，成员变量归宿对象本身。
	 * System.out.println 打印出50个记录。
	 */
	int i;
	
	@Override
	public void run()
	{
		/*这里的int i是局部变量，线程在运行的时候回有一个局部变量的copy，所以二个线程有二个int i
		 * System.out.println 打印出100个记录。
		 */
		int i = 0;
		
		while(true)
		{
			System.out.println("number: " + this.i++);
			
			try
			{
				Thread.sleep((long)(Math.random() * 1000));
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
			if(50 == this.i)
			{
				break;
			}
		}
	}
}
