package com.steven.xml.dom4j;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.DOMReader;
import org.dom4j.io.SAXReader;

public class Test2
{
	public static void main(String[] args) throws Exception
	{
		SAXReader saxReader = new SAXReader();
		
		Document doc = saxReader.read(new File("student2.xml"));
		
		Element root = doc.getRootElement();
		
		System.out.println("root element: " + root.getName());
		//获得根元素下面所有的子元素，空白不是子元素，所以下列list中不包括空白。
		List childList = root.elements();
		
		System.out.println(childList.size());
		//返回所有元素名是hello的元素
		List childList2 = root.elements("hello");
		
		System.out.println(childList2.size());
		//返回第一个元素名是hello的元素
		Element first = root.element("hello");
		
		System.out.println(first.attributeValue("age"));
		//获得子元素的迭代elementIterator()
		for(Iterator iter = root.elementIterator(); iter.hasNext();)
		{
			Element e = (Element)iter.next();
			
			System.out.println(e.attributeValue("age"));
		}
		
		System.out.println("---------------------------");
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		/**在一个文件中使用了二个名字相同的类document但是位于不同的包下面
		 * 这时你必须制定包的全名org.w3c.dom.Document
		 */
		org.w3c.dom.Document document = db.parse(new File("student2.xml"));
		
		DOMReader domReader = new DOMReader();
		
		//将JAXP的Document转换为dom4j的Document
		Document d = domReader.read(document);
		
		Element rootElement = d.getRootElement();
		
		System.out.println(rootElement.getName());
		
		
		
		
		
		
		
		
		
	}
}
