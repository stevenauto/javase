package com.steven.io;

import java.io.File;

public class FileRecursion
{
	public static void deleteAll(File file)
	{
		/**file.list()文件夹为空
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
				//先删除内容再删除自己
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
