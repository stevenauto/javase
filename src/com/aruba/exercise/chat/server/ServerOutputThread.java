package com.aruba.exercise.chat.server;

import java.io.BufferedInputStream;
import java.io.OutputStream;
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
			BufferedInputStream br = new BufferedInputStream(
					System.in);
			byte[] buffer = new byte[200];
			int length =br.read();
			os.write(buffer);
		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}
}
