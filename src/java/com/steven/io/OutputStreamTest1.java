package com.steven.io;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamTest1
{
	public static void main(String[] args) throws Exception
	{
		/**true表示追加，FileOutputStream（"String"）;表示覆盖
		 * 
		 */
		OutputStream os = new FileOutputStream("c:\\out.txt", true);
		
		String str = "aaaaa";
		
		byte[] buffer = str.getBytes();
		
		os.write(buffer);
		
		os.close();
	}
}
