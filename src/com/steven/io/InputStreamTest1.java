package com.steven.io;

import java.io.FileInputStream;
import java.io.InputStream;
/**InputStream,OutputStream字节流，输入和输出流是抽象类，没办法new
 * 字符流  Reader,Writer也是抽象类，
 * @author aruba
 *
 */
public class InputStreamTest1
{
	public static void main(String[] args) throws Exception
	{
		InputStream is = new FileInputStream("e:/HSSFChart.java");
		
		byte[] buffer = new byte[200];
		
		int length = 0;
		
		while(-1 != (length = is.read(buffer, 0, 200)))
		{
			//字节显示不出来，必须转换成字符，需要用方法string(byte[],offset,length)
			String str = new String(buffer,0, length);//由字节数组转成字符串
			
			System.out.println(str);
			
		}
			
		is.close();	
			
	}
}
