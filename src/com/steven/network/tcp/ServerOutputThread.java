package com.steven.network.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

			while(true)
			{
				/*InputStreamReader是字符流与字节流之间的桥梁
				 * 同样它也是阻塞的方法一直等到有数据才执行
				 */
				BufferedReader reader = new BufferedReader(new InputStreamReader(
						System.in));
				
				String line = reader.readLine();
				
				os.write(line.getBytes());
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
