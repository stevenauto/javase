package com.steven.code13.io2;

import java.io.FileInputStream;
import java.io.InputStream;
/**InputStream,OutputStream�ֽ����������������ǳ����࣬û�취new
 * Reader,WriterҲ�ǳ����࣬�ַ���
 * @author aruba
 *
 */
public class InputStreamTest1
{
	public static void main(String[] args) throws Exception
	{
		InputStream is = new FileInputStream("e:/HSSFChart.java");
		
		byte[] buffer = new byte[200];
		
		int length = 0;
		
		while(-1 != (length = is.read(buffer, 0, 200)))
		{
			
			String str = new String(buffer,0, length);//���ֽ�����ת���ַ���
			
			System.out.println(str);
			
		}
			
		is.close();	
			
	}
}
