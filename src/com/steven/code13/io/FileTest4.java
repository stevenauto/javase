package com.steven.code13.io;

import java.io.File;

public class FileTest4
{
	public static void main(String[] args)
	{
		File file = new File("e:/cvs");
		
//		String[] names = file.list();��listFiles����ֵһ������������ļ����µ��ļ���Ŀ¼��
//		
//		for(String name : names)
//		{
//			System.out.println(name);
//		}
		
		File[] files = file.listFiles();
		
		for(File f : files)
		{
			System.out.println(f.getName());
			System.out.println(f.getParent());
		}
		
		
		
		
	}
}
