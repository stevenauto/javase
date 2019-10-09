package com.steven.network.tcp;

import java.net.ServerSocket;
import java.net.Socket;

public class MainServer
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket serverSocket = new ServerSocket(4000);
		
		while(true)
		{
			//accept也是阻塞
			Socket socket = serverSocket.accept();
			
			//启动读写线程
			new ServerInputThread(socket).start();
			new ServerOutputThread(socket).start();
		}
	}
}
