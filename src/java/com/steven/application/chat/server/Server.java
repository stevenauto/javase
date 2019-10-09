package com.steven.application.chat.server;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.steven.application.chat.util.XMLUtil;

/**������˳��1 �ͻ�������server�˵�ServerConnection�����ӳɹ���������������
 * ServerMessageThread��ServerConnection�����̣߳��������ͻ���ͨ�š�ÿ��
 * ServerMessageThread��Ӧһ��client���ͻ��ͷ�����֮�������ͨ�Ŷ�����������̼߳䡣
 * 2 ���ڿͻ��˺ͷ������Ķ����߳���˵��run�����ʼ������read�������ȴ��Է��������ݡ�
 * 3����run�����⣬���߶�������sendMessage�������������ݽ���output��������Է�������run����
 * �����ա�
 * 
 * 
 * @author aruba
 *
 */

public class Server extends JFrame
{
	private JLabel jLabel1;

	private JLabel jLabel2;

	private JLabel jLabel3;

	private JButton jButton;

	private JPanel jPanel1;

	private JPanel jPanel2;

	private JScrollPane jScrollPane;

	private JTextArea jTextArea;

	private JTextField jTextField;
	
	private Map<String, ServerMessageThread> map = new HashMap<String, ServerMessageThread>();
	
	private ServerConnection serverconnection;
	
	public ServerConnection getServerconnection() {
		return serverconnection;
	}

	public void setServerconnection(ServerConnection serverconnection) {
		this.serverconnection = serverconnection;
	}

	public Server(String name)
	{
		super(name);

		this.initComponents(); //initialize UI
	}
	
	public Map<String, ServerMessageThread> getMap()
	{
		return map;
	}

	public JLabel getJLabel2()
	{
		return jLabel2;
	}

	public JButton getJButton()
	{
		return jButton;
	}

	public JTextArea getJTextArea()
	{
		return jTextArea;
	}

	public JTextField getJTextField()
	{
		return jTextField;
	}

	public void setJTextField(JTextField textField)
	{
		jTextField = textField;
	}

	private void initComponents()
	{
		jPanel1 = new JPanel();
		jPanel2 = new JPanel();
		
		jLabel1 = new JLabel();
		jLabel2 = new JLabel();
		jLabel3 = new JLabel();
		
		jTextField = new JTextField(10);
		jButton = new JButton();
		jScrollPane = new JScrollPane();
		jTextArea = new JTextArea();
		

		jPanel1.setBorder(BorderFactory.createTitledBorder("��������Ϣ"));
		jPanel2.setBorder(BorderFactory.createTitledBorder("�����û��б�"));

		jTextField.setText("5000");
		
		jLabel1.setText("������״̬");
		jLabel2.setText("ֹͣ");
		jLabel2.setForeground(new Color(204, 0, 51));
		jLabel3.setText("�˿ں�");

		jButton.setText("����������");
		
		
		jButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				Server.this.execute(event);
			}
		});
		
		this.addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				try
				{
					Collection<ServerMessageThread> cols = Server.this.map.values();
					
					String messageXML = XMLUtil.constructCloseServerWindowXML();
					
					for(ServerMessageThread smt : cols)
					{
						smt.sendMessage(messageXML);
					}
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				finally
				{
					System.exit(0);
				}
			}
		});
		

		jPanel1.add(jLabel1);
		jPanel1.add(jLabel2);
		jPanel1.add(jLabel3);
		jPanel1.add(jTextField);
		jPanel1.add(jButton);

		jTextArea.setEditable(false); //�������û��ֶ��޸������û��б�
		jTextArea.setRows(30);
		jTextArea.setColumns(30);
		jTextArea.setForeground(new Color(0, 51, 204));

		jScrollPane.setViewportView(jTextArea); //��JTextArea���õ�JScrollPane��

		jPanel2.add(jScrollPane);

		this.getContentPane().add(jPanel1, BorderLayout.NORTH);
		this.getContentPane().add(jPanel2, BorderLayout.SOUTH);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setAlwaysOnTop(true);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
	}

	private void execute(ActionEvent evt)
	{
		int port = Integer.parseInt(this.getJTextField().getText());
		if("����������".equals(this.getJButton().getText())){
			this.serverconnection=new ServerConnection(this,port);
		    this.serverconnection.start();
		    System.out.println("Start Server successfully");
		}else if("ֹͣ������".equals(this.getJButton().getText())){
			System.out.println(this.serverconnection);
			System.out.println("Stop Server successfully");
		}
		

		
	}

	public static void main(String[] args)
	{
		new Server("������");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
