package com.steven.dom4j;

import java.io.FileOutputStream;
import java.io.FileWriter;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class Test1
{
	public static void main(String[] args) throws Exception
	{
		// 创建文档并设置文档的根元素节点 ：第一种方式
		// Document document = DocumentHelper.createDocument();
		//
		// Element root = DocumentHelper.createElement("student");
		//
		// document.setRootElement(root);

		// 创建文档并设置文档的根元素节点 ：第二种方式
		Element root = DocumentHelper.createElement("student");
		Document document = DocumentHelper.createDocument(root);

		root.addAttribute("name", "zhangsan");

		Element helloElement = root.addElement("hello");
		Element worldElement = root.addElement("world");

		helloElement.setText("hello");
		worldElement.setText("world");

		helloElement.addAttribute("age", "20");

		XMLWriter xmlWriter = new XMLWriter();
		xmlWriter.write(document);
		
		OutputFormat format = new OutputFormat("    ", true);
		
		XMLWriter xmlWriter2 = new XMLWriter(new FileOutputStream("student2.xml"), format);
		xmlWriter2.write(document);
		
		XMLWriter xmlWriter3 = new XMLWriter(new FileWriter("student3.xml"), format);
		/**xmlWriter3.flush()或者close必须加 字节流不需要刷新，字符流需要刷新
		 * 不刷新就存不到数据库中。
		 */
		xmlWriter3.write(document);
		xmlWriter3.close();


	}
}
