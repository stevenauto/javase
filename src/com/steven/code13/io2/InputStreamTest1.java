package com.steven.code13.io2;

import java.io.FileInputStream;
import java.io.InputStream;
/**InputStream,OutputStream字节流，输入和输出流是抽象类，没办法new
 * Reader,Writer也是抽象类，字符流
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
			
			String str = new String(buffer,0, length);//由字节数组转成字符串
			
			System.out.println(str);
			
		}
			
		is.close();	
			
	}
}
