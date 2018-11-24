package com.steven.code1;

public class ParamTest
{
	/*这个java可以生成二个.class文件，因为这个文件中包括二个class
	 * 如果没有p = new Point();这个定义，输出是3,4，增加它后是0,0。
	 * 另外指向一个对象，不是原来的对象了。new的过程中改变了
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
 * point传的是引用，也就是地址。
 */
		pt.changePoint(point);

		System.out.println(point.x);
		System.out.println(point.y);
	}
}

class Point
{
	int x; //横坐标
	int y; //纵坐标
}
