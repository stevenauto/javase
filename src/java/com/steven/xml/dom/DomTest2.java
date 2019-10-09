package com.steven.xml.dom;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DomTest2
{
	public static void main(String[] args) throws Exception
	{
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		DocumentBuilder db = dbf.newDocumentBuilder();
		
		Document doc = db.parse(new File("student.xml"));
//		System.out.println(doc.getXmlEncoding());
//		System.out.println(doc.getXmlVersion());
//		System.out.println(doc.getXmlStandalone());
		
		//获得文档的根元素节点
		Element root = doc.getDocumentElement();
		
		System.out.println(root.getTagName());
		 /**空格也是作为子元素，空格也是孩子的一部分，root.getChildNodes()结果为7而不是3
		  * 原因就是中间有4个空格（它的name是#text），下面forloop的输出是：
		  * 7
			#text（text接口的nodename缺省是它）
			学生（element接口的值是Element.tagName）
			#text
			学生
			#text
			学生
			#text
		  */
		
		NodeList list = root.getChildNodes();
		
		System.out.println(list.getLength());
		
		for(int i = 0; i < list.getLength(); i++)
		{
			System.out.println(list.item(i).getNodeName());
		}
		
		System.out.println("----------------------------------");
		
		for(int i = 0; i < list.getLength(); i++)
		{
			Node n = list.item(i);
			
			System.out.println(n.getNodeType() + " : " + n.getNodeValue());
		}
		
		System.out.println("----------------------------------");
		
		for(int i = 0; i < list.getLength(); i++)
		{
			Node n = list.item(i);
			
			System.out.println(n.getTextContent());
		}
		
		System.out.println("----------------------------------");
		
		NodeList nodeList = doc.getElementsByTagName("学生");
		
		for(int i = 0; i < nodeList.getLength(); i++)
		{
			NamedNodeMap nnm = nodeList.item(i).getAttributes();
			

			String attrName = nnm.item(0).getNodeName();
			System.out.print(attrName);
			
			System.out.print("=");
			
			String attrValue = nnm.item(0).getNodeValue();
			
			System.out.println(attrValue);
		}

	}
}
