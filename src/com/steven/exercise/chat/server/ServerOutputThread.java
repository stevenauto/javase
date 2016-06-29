package com.steven.exercise.chat.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class ServerOutputThread extends Thread
{
	private Socket socket;

	public ServerOutputThread(Socket socket)
	{
		this.socket = socket;
	}

	@Override
	public void run()
	{
		try
		{
			OutputStream os = socket.getOutputStream();

			while (true)
			{
				BufferedReader br = new BufferedReader(new InputStreamReader(
						System.in));
				InetAddress d=socket.getInetAddress();
				int port = socket.getPort();
				String str =br.readLine();
				os.write(str.getBytes());
				
			}

		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}
}
