package com.steven.io;

import java.io.File;

public class FileTest3
{
	public static void main(String[] args)
	{
		File file = new File("c:/abc/xyz/hello");
		/**mkdir����һ���ļ���Ҳ����abc��xyz�����Ѿ����ڲ��ܴ���hello��mkdirs�����༶
		 * 
		 */
		
		System.out.println(file.mkdirs());
		
		System.out.println(file.isFile());
	}
}
