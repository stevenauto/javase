package com.steven.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStream1
{
	public static void main(String[] args) throws Exception
	{
		/*FileOutputStream是节点流可以直接和文件打交道，DataOutputStream和BufferedOutputStream
		 * 是过滤流，buffered是为了缓冲(避免频繁的操作io设备)，data是为了支持java基本的过滤类型。
		 * 
		 */
		DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(
				new FileOutputStream("data.txt")));

		byte b = 3;
		int i = 12;
		char ch = 'a';
		float f = 3.3f;
		/**写入的是二进制信息，打开文件时乱码，8位的byte，32int，
		 * 
		 */
		dos.writeByte(b);
		dos.writeInt(i);
		dos.writeChar(ch);
		dos.writeFloat(f);

		dos.close();

		DataInputStream dis = new DataInputStream(new BufferedInputStream(
				new FileInputStream("data.txt")));
		
		//读和写的顺序要保持一致
		System.out.println(dis.readByte());
		System.out.println(dis.readInt());
		System.out.println(dis.readChar());
		System.out.println(dis.readFloat());
		
		dis.close();
	}
}
