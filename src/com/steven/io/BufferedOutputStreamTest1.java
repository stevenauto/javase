package com.steven.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class BufferedOutputStreamTest1
{
	public static void main(String[] args) throws Exception
	{
		OutputStream os = new FileOutputStream("1.txt");
		
		BufferedOutputStream bos = new BufferedOutputStream(os);
		
		bos.write("http://www.google.com".getBytes());
		
		bos.close();//close的时候才写内容到文件，或者用bos.flush();
		os.close();
	}
}
