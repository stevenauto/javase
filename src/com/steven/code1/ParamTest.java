package com.steven.code1;

public class ParamTest
{
	/*���java�������ɶ���.class�ļ�����Ϊ����ļ��а�������class
	 * ���û��p = new Point();������壬�����3,4������������0,0��
	 * ����ָ��һ�����󣬲���ԭ���Ķ����ˡ�new�Ĺ����иı���
	 */
	public void changePoint(Point p)
	{
		p = new Point();

		p.x = 3;
		p.y = 4;	
	}	
	
	public static void main(String[] args)
	{
		ParamTest pt = new ParamTest();
		Point point = new Point();
/*
 * point���������ã�Ҳ���ǵ�ַ��
 */
		pt.changePoint(point);

		System.out.println(point.x);
		System.out.println(point.y);
	}
}

class Point
{
	int x; //������
	int y; //������
}
