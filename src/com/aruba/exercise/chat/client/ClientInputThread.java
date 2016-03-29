package com.aruba.exercise.chat.client;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.Socket;

public class ClientInputThread extends Thread
{
	private Socket socket;

	public ClientInputThread(Socket socket)
	{
		this.socket = socket;
	}

	@Override
	public void run()
	{
		try{
			InputStream is = socket.getInputStream();
			BufferedInputStream bi = new BufferedInputStream(is);
			byte[] buffer = new byte[200];
			int length = bi.read(buffer);
			System.out.print(new String(buffer, 0, length));
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
