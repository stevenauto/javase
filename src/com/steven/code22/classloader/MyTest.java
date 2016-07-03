package com.steven.code22.classloader;
/**��������counter1 = 1��count2 =0��
 * �����ǣ�1����̬������ֵ��Ĭ��ֵ����singleton=null,counter1=0,counter2=0��
 * 2 ��ʼ�������ϵ��£�new Singleton������ִ�н����counter1=1;counter2=1;(�ڹ��췽����ʵ�֣���
 * Ȼ��û�иı�counter1��ֵ�����Ƕ�counter2��ֵ������counter2����0��
 * �����private static Singleton singleton = new Singleton();����public static int counter2 = 0;
 * ����ô��������counter1 = 1��count2 =1��
 * 
 * @author aruba
 *
 */

class Singleton
{
	private static Singleton singleton = new Singleton();
	public static int counter1;
	public static int counter2 = 0;//(���0���ǵ�һ���ĳ�ʼֵ)
	
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
		Singleton singleton = Singleton.getInstance();//������ľ�̬����������ʹ�ã��ᵼ����ļ���
		System.out.println("counter1 = " + singleton.counter1);
		System.out.println("counter2 = " + singleton.counter2);
	}
}

















