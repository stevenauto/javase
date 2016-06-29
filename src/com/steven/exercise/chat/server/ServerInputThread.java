package com.steven.exercise.chat.server;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ServerInputThread extends Thread
{
	private Socket socket;
	public ServerInputThread(Socket socket){
		this.socket=socket;
	}
	
	@Override
	public void run()
	{
		try{
			InputStream is = socket.getInputStream();
			while(true){
				byte[] buffer = new byte[200];
				int length=0;	
				length=is.read(buffer);
				String str = new String(buffer,0,length);
				System.out.println(str);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
		}
		
		
	}
	
}
