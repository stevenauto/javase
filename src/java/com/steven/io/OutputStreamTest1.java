package com.steven.io;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamTest1
{
	public static void main(String[] args) throws Exception
	{
		/**true��ʾ׷�ӣ�FileOutputStream��"String"��;��ʾ����
		 * 
		 */
		OutputStream os = new FileOutputStream("c:\\out.txt", true);
		
		String str = "aaaaa";
		
		byte[] buffer = str.getBytes();
		
		os.write(buffer);
		
		os.close();
	}
}
