package com.steven.thread;

public class ThreadMemberLocalVar
{
	public static void main(String[] args)
	{
		Runnable r = new HelloThread();
		
		Thread t1 = new Thread(r);
		//����Ƕ���runnable�����ͻ��ӡ100������Ϊ�ж���hellothread����
		//r = new HelloThread();
		
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
	}
}

class HelloThread implements Runnable
{
	/*��Ϊֻ��һ������int i�ǳ�Ա���������Զ����̹߳���һ����Ա������Ҳ����˵��Ȼ�ж����̵߳������Ƿ��ʵ���
	 * ͬһ������ĳ�Ա����i����Ա�������޶�����
	 * System.out.println ��ӡ��50����¼��
	 */
	int i;
	
	@Override
	public void run()
	{
		/*�����int i�Ǿֲ��������߳������е�ʱ�����һ���ֲ�������copy�����Զ����߳��ж���int i
		 * System.out.println ��ӡ��100����¼��
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
