package com.steven.classloader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class MyClassLoader extends ClassLoader
{
	private String name; //类加载器的名字
	
	private String path = "d:\\"; // 加载类的路径
	
	private final String fileType = ".class"; // class文件的扩展名
	
	public MyClassLoader(String name)
	{
		super(); // 让系统类加载器成为该类加载器的父加载器
		
		this.name = name;
	}
	
	public MyClassLoader(ClassLoader parent, String name)
	{
		super(parent); // 显式指定该类加载器的父加载器
		
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return this.name;
	}

	public String getPath()
	{
		return path;
	}

	public void setPath(String path)
	{
		this.path = path;
	}
	/**必须重写findClass因为默认抛出异常。
	 * 将loadclassdata获得的字节数组转换成class对象。
	 */
	@Override
	public Class<?> findClass(String name) throws ClassNotFoundException
	{
		byte[] data = this.loadClassData(name);
		
		return this.defineClass(name, data, 0, data.length);
	}
	/*这个方法获得了class的字节数组
	 * 
	 */
	private byte[] loadClassData(String name)
	{
		InputStream is = null;
		byte[] data = null;
		ByteArrayOutputStream baos = null;
		
		try
		{
			this.name = this.name.replace(".", "\\");
			
			is = new FileInputStream(new File(path + name + fileType));
			
			baos = new ByteArrayOutputStream();
			
			int ch = 0;
			
			while(-1 != (ch = is.read()))
			{
				baos.write(ch);
			}
			
			data = baos.toByteArray();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				is.close();
				baos.close();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		
		return data;
	}
	
	public static void main(String[] args) throws Exception
	{
		//load1的父加载器是system类加载器
		MyClassLoader loader1 = new MyClassLoader("loader1");
		
		loader1.setPath("d:\\myapp\\serverlib");
		//下面定义loader1为loader2的父加载器。
		MyClassLoader loader2 = new MyClassLoader(loader1, "loader2");
		
		loader2.setPath("d:\\myapp\\clientlib");
		//null代表父加载器为根加载器，缺省为系统加载器。
		MyClassLoader loader3 = new MyClassLoader(null, "loader3");
		
		loader3.setPath("d:\\myapp\\otherlib");
		
		test(loader2);
		test(loader3);
	}
	
	public static void test(ClassLoader loader) throws Exception
	{
		Class clazz = loader.loadClass("Sample");
		
		Object object = clazz.newInstance();
	}

}
