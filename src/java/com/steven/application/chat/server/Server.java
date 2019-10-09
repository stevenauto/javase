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

/**整个的顺序：1 客户端连到server端的ServerConnection，连接成功，服务器会启动
 * ServerMessageThread（ServerConnection的子线程）由它跟客户端通信。每个
 * ServerMessageThread对应一个client，客户和服务器之间的所有通信都是在这二个线程间。
 * 2 对于客户端和服务器的二个线程来说，run方法最开始都是在read阻塞，等待对方发送数据。
 * 3除了run方法外，二边都定义了sendMessage方法来发送数据借助output输出流，对方都是用run方法
 * 来接收。
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
		

		jPanel1.setBorder(BorderFactory.createTitledBorder("服务器信息"));
		jPanel2.setBorder(BorderFactory.createTitledBorder("在线用户列表"));

		jTextField.setText("5000");
		
		jLabel1.setText("服务器状态");
		jLabel2.setText("停止");
		jLabel2.setForeground(new Color(204, 0, 51));
		jLabel3.setText("端口号");

		jButton.setText("启动服务器");
		
		
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

		jTextArea.setEditable(false); //不允许用户手动修改在线用户列表
		jTextArea.setRows(30);
		jTextArea.setColumns(30);
		jTextArea.setForeground(new Color(0, 51, 204));

		jScrollPane.setViewportView(jTextArea); //将JTextArea放置到JScrollPane中

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
		if("启动服务器".equals(this.getJButton().getText())){
			this.serverconnection=new ServerConnection(this,port);
		    this.serverconnection.start();
		    System.out.println("Start Server successfully");
		}else if("停止服务器".equals(this.getJButton().getText())){
			System.out.println(this.serverconnection);
			System.out.println("Stop Server successfully");
		}
		

		
	}

	public static void main(String[] args)
	{
		new Server("服务器");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
