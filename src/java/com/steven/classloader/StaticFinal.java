package com.steven.classloader;

class FinalTest
{
	/**�������FinalTest static block����Ϊx��һ������ʱ�ĳ�����System.out.println(FinalTest.x);
	 * ���ᵼ����FinalTest����ʼ����
	 * Test3:public static final int x = new Random().nextInt(100);������ʱ����ȷ��x�Ǽ�������
	 * ���class FinalTest2���г�ʼ����
	 * Ҳ����˵���x��һ������ʱ�ĳ��������Ͳ�������ʼ����������ǳ����ͻ�����ʼ����
	 * 
	 */
	public static final int x = 6 / 3;
	
	static
	{
		System.out.println("FinalTest static block");
	}
}

public class StaticFinal
{
	public static void main(String[] args)
	{
		System.out.println(FinalTest.x);
	}
}
