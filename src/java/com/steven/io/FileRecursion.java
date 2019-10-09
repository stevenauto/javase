package com.steven.io;

import java.io.File;

public class FileRecursion
{
	public static void deleteAll(File file)
	{
		/**file.list()�ļ���Ϊ��
		 * 
		 */
		if(file.isFile() || file.list().length == 0)
		{
			file.delete();
		}
		else
		{
			File[] files = file.listFiles();
			
			for(File f : files)
			{
				//��ɾ��������ɾ���Լ�
				deleteAll(f);
				
				f.delete();
			}
		}
	}
	
	
	public static void main(String[] args)
	{
		deleteAll(new File("c:\\jakarta-jmeter-2.4"));
	}
}
