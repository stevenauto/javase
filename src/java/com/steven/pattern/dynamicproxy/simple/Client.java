package com.steven.pattern.dynamicproxy.simple;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * ʵ�ֶ�̬��������ע�������һ��һ��Ҫʵ��InvocationHandler�ӿڣ�
 * �������������ת��newProxyInstance��
 * ���һ������
 * @author root
 *
 */
public class Client
{
	public static void main(String[] args)
	{
		RealSubject realSubject = new RealSubject();

		InvocationHandler handler = new DynamicSubject(realSubject);

		Class<?> classType = handler.getClass();
		Class<?> class1Type = realSubject.getClass();
		
		System.out.println(classType);
		System.out.println(class1Type);
		/**����Ĵ�����ɶ������飬1 �����е�ʱ�����������class��Ȼ������class�Ķ���
		 * ������һ������ʵ�������ʵ�����������ڼ䶯̬�������Ǹ����ʵ����$Proxy0),���ɵ�����ص�
		 * ��ʵ����realSubject.getClass().getInterfaces()�ӿڣ�subject��������
		 * ����ת��Ϊ(Subjectһ��Ҫת���ɽӿ����ͣ���Ϊ����֪������ʵ����˭)(ʵ����˭�Ϳ���ת��Ϊ˭����
		 * 
		 * �����ɶ�̬����class��ʱ������ṩһ��ӿڸ�����Ȼ���class��������ʵ��������ӿ�like this
		 * public class $Proxy0 implements subject
		 * {
		 * }
		 * java�е�ÿһ���඼��ͨ��classloader�����صġ�classType.getClassLoader()
		 * classType1.getClassLoader(),һ�����������Լ��غܶ����
		 * ���ڴ����realsubjectֱ����Ҫ����ͬ�Ľӿ�������Ҫ��仰realSubject.getClass().getInterfaces()
		 * ������proxy��realsubjectʵ������ͬ�Ľӿ����Կ����ɴ����������������
		 */

		Subject subject = (Subject) Proxy.newProxyInstance(classType
				.getClassLoader(), realSubject.getClass().getInterfaces(),
				handler);
		/**
		 * ÿһ������ʵ������һ����֮������InvocationHandler�������ǵ���һ������ʵ����ĳ������ʱ,
		 * ����������þͻᱻ���벢���ɷ������ô�������invoke�����ϡ�
		 */
		subject.request();//����������ʱ��ֱ�Ӿ�ת��handler��handler�ͻ�ִ��invoke����

		System.out.println(subject.getClass());

	}
	
	
	
	
	
	
	
	
}
