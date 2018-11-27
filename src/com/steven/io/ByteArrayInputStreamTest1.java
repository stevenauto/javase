package com.steven.io;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamTest1
{
	public static void main(String[] args)
	{
		String temp = "abc";
		
		byte[] b = temp.getBytes();
		
		ByteArrayInputStream in = new ByteArrayInputStream(b);
		
		for(int i = 0; i < 2; i++)
		{
			int c;
			/**in.read()返回整形32bit，事实上只取低8位的，其它24位全部忽略。
			 * (char)c--必须进行转换，因为java中的字符以整形来存放，如果直接打印出来时数字
			 */
			while(-1 != (c = in.read()))
			{
				if(0 == i)
				{
					System.out.println((char)c);
				}
				else
				{
					System.out.println(Character.toUpperCase((char)c));
				}
			}
					
			System.out.println();
			
			in.reset();//重新回到流的开始
			
			
			
			
			
			
			
			
		}
		
	}
}
