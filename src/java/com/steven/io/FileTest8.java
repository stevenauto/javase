package com.steven.io;

import java.io.File;
import java.io.IOException;

public class FileTest8
{
	public static void main(String[] args) throws IOException
	{
		File file = new File(File.separator);//��ǰĿ¼�ĸ�Ŀ¼��
		
		File file2 = new File(file, "test.txt");
		
		System.out.println(file2.createNewFile());
	}
}
