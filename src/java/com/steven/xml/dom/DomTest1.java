package com.steven.xml.dom;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class DomTest1
{
	public static void main(String[] args) throws Exception
	{
		// step 1: 获得dom解析器工厂（工作的作用是用于创建具体的解析器）
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		/**class name:com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl
		 * jaxp==java api for xml parsing
		 */
		
		System.out.println("class name: " + dbf.getClass().getName());
		
		/**	 * 
		 *  step 2:获得具体的dom解析器
		 * @author root
		 *	class name:com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderImpl
		 */


		DocumentBuilder db = dbf.newDocumentBuilder();
		
//		System.out.println("class name: " + db.getClass().getName());
		
		/**step3: 解析一个xml文档，获得Document对象（根结点）candidate.xml跟src并列。
		 * 需要放在工程根目录下，不能放在src下， 
		 */
		Document document = db.parse(new File("candidate.xml"));
		
		NodeList list = document.getElementsByTagName("PERSON");
		
		for(int i = 0; i < list.getLength(); i++)
		{
			Element element = (Element)list.item(i);
			
			/**<PEOPLE><PERSON PERSONID="E01"><NAME>Tony Blair</NAME>
			 * element.getElementsByTagName("NAME").item(0)为“Tony Blair”
			 * element.getElementsByTagName("NAME").item(0).getNodeValue()得到的值为null，因为
			 * dom把“Tony Blair”看着一个node，所以需要getFirstChild().getNodeValue()
			 * 
			 */
			
			String content = element.getElementsByTagName("NAME").item(0).getFirstChild().getNodeValue();
			
			System.out.println("name:" + content);
			
			content = element.getElementsByTagName("ADDRESS").item(0).getFirstChild().getNodeValue();
			
			System.out.println("address:" + content);
			
			content = element.getElementsByTagName("TEL").item(0).getFirstChild().getNodeValue();
			
			System.out.println("tel:" + content);
			
			content = element.getElementsByTagName("FAX").item(0).getFirstChild().getNodeValue();
			
			System.out.println("fax:" + content);
			
			content = element.getElementsByTagName("EMAIL").item(0).getFirstChild().getNodeValue();
			
			System.out.println("email:" + content);
			
			System.out.println("--------------------------------------");
		}
	}
}
