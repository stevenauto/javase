package com.steven.pattern.dynamicproxy.simple;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.steven.pattern.proxy.RealSubject;

/**
 * �ô�������ڲ�������Object���ͣ�ʵ��ʹ�õ�ʱ��ͨ������Ĺ��췽�����ݽ���һ������
 * ���⣬���໹ʵ����invoke�������÷����е�method.invoke��ʵ���ǵ��ñ��������Ľ�Ҫ
 * ִ�еķ���������������sub����ʾ�÷���������sub��ͨ����̬�����࣬���ǿ�����ִ����ʵ����ķ���ǰ��
 * �����Լ���һЩ���ⷽ����
 *ʵ�ֶ�̬�������Ҫʵ��InvocationHandler
 */

public class DynamicSubject implements InvocationHandler
{
	/**����ʵ��������ã���Ϊ����һ����̬����private RealSubject realSubject�����д������
	 * ��Ϊ��֪����ʵ��������ͣ���д��Object sub
	 */
	private Object sub;
	
	public DynamicSubject(Object obj)
	{
		this.sub = obj;
	}
	/**�������ʵ���ϵķ������ò��ѽ���������������ǵ���һ��������ʱ�򲢲����ɴ�������ɶ����ɴ����
	 * InvocationHandler��invoke����������ɡ�
	 * Object proxy��������һ������ʵ���ķ�����Method method��methodʵ����Ӧ�ڴ���ʵ���ϵı�
	 * ���õķ�����Object[] args�Ƿ�������Ҫ�Ĳ���
	 * 
	 */
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable
	{
		System.out.println("before calling: " + method);
		
		method.invoke(sub, args);//�൱�ھ�̬�����realSubject.request()
		
		System.out.println(args == null);
		
		System.out.println("after calling: " + method);
		
		return null;
	}
}
