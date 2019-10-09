package com.steven.network.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpClient
{
	public static void main(String[] args) throws Exception
	{
		DatagramSocket socket = new DatagramSocket();

		String str = "hello world";

		DatagramPacket packet = new DatagramPacket(str.getBytes(),
				str.length(), InetAddress.getByName("localhost"), 7000);
		
		socket.send(packet);
		
		byte[] buffer = new byte[1000];
		//�ȹ���һ���յ��ֽ����飬���յ����ݺ�����Щ���������������顣
		DatagramPacket packet2 = new DatagramPacket(buffer,100);
		
		socket.receive(packet2);
		
		System.out.println(new String(buffer, 0, packet2.getLength()));
		
		socket.close();
	}
}
