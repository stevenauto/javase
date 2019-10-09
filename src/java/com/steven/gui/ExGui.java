package com.steven.gui;

import java.awt.Button;
import java.awt.Frame;

public class ExGui
{
	private Frame frame;
	
	private Button button1;
	
	private Button button2;
	
	public void go()
	{
		frame = new Frame("gui example");
		
		/**frame.setLayout(new FlowLayout());��ʽ�Ĳ��ֹ����������ǰ�ťһ����һ���ţ�borderlayout����
		 *������ť���ص������ţ������ϱ����������Ҷ�������Ĭ�Ͼ��У��������Ǿ������Եڶ����Ḳ�ǵ�һ����
		 */
		
		
		button1 = new Button("Press me");
		button2 = new Button("Don't press me");
		
		frame.add(button1);
		frame.add(button2);
		
		frame.pack();//frame�պ������ɶ�����ť��С��
		frame.setVisible(true);	
	}
	
	public static void main(String[] args)
	{
		ExGui window = new ExGui();
		window.go();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
