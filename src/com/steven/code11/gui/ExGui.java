package com.steven.code11.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class ExGui
{
	private Frame frame;
	
	private Button button1;
	
	private Button button2;
	
	public void go()
	{
		frame = new Frame("gui example");
		
		/**frame.setLayout(new FlowLayout());流式的布局管理器，就是按钮一个接一个放，borderlayout不是
		 *二个按钮会重叠起来放，按照上北下南左西右东来排列默认居中，二个都是居中所以第二个会覆盖第一个。
		 */
		
		
		button1 = new Button("Press me");
		button2 = new Button("Don't press me");
		
		frame.add(button1);
		frame.add(button2);
		
		frame.pack();//frame刚好能容纳二个按钮大小，
		frame.setVisible(true);	
	}
	
	public static void main(String[] args)
	{
		ExGui window = new ExGui();
		window.go();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
