package com.aruba.exercise.chat.client;

import java.io.BufferedInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientOutputThread extends Thread
{
	private Socket socket;
	
	public ClientOutputThread(Socket socket){
		this.socket=socket;
	}
	@Override
	public void run()
	{
		try{
			OutputStream os = socket.getOutputStream();
			while(true){
				BufferedInputStream bi = new BufferedInputStream(System.in);
				byte[] buffer = new byte[200];
				int length = bi.read(buffer);
				os.write(buffer);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
