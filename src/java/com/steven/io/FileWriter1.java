package com.steven.io;

import java.io.FileWriter;

public class FileWriter1
{
	public static void main(String[] args) throws Exception
	{
		String str = "hello world welcome nihao hehe";
		
		char[] buffer = new char[str.length()];
		//相当于copy	 string到数组
		str.getChars(0, str.length(), buffer, 0);
		
		FileWriter f = new FileWriter("file2.txt");
		
		for(int i = 0; i < buffer.length; i++)
		{
			f.write(buffer[i]);
		}
		
		f.close();

	}
}
