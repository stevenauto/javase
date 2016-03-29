package com.aruba.exercise.chat.client;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class MainClient
{
	public static void main(String[] args) throws Exception
	{
		Socket socket = new Socket("127.0.0.1",8000);
		new ClientInputThread(socket).start();
		new ClientOutputThread(socket).start();
		
		
		
		
	}
}
