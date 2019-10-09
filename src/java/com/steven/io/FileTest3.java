package com.steven.io;

import java.io.File;

public class FileTest3
{
	public static void main(String[] args)
	{
		File file = new File("c:/abc/xyz/hello");
		/**mkdir创建一级文件夹也就是abc和xyz必须已经存在才能创建hello，mkdirs创建多级
		 * 
		 */
		
		System.out.println(file.mkdirs());
		
		System.out.println(file.isFile());
	}
}
