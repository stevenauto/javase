package com.steven.exercise.chat.client;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class MainClient
{
	public static void main(String[] args) throws Exception
	{
		Socket socket = new Socket("127.0.0.1",5000);
		new ClientOutputThread(socket).start();
		new ClientInputThread(socket).start();
		
	}
}
