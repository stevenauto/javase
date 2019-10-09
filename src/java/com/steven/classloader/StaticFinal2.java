package com.steven.classloader;

import java.util.Random;

class FinalTest2
{
	/**�������FinalTest static block����Ϊx��һ������ʱ�ĳ�����System.out.println(FinalTest.x);
	 * ���ᵼ����FinalTest�����ء�
	 * Test3:public static final int x = new Random().nextInt(100);������ʱ����ȷ��x�Ǽ�������
	 * ���class FinalTest2���г�ʼ����
	 * Ҳ����˵���x��һ������ʱ�ĳ������Ͷ����ʼ����������ǳ����ͻ�����ʼ����
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
