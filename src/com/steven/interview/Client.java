package com.steven.interview;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
	
	public static void main(String[] args) {
		RealSubject sub = new RealSubject();
		InvocationHandler handler = new DynamicProxy(sub);
		
		Class<?> classtype = Subject.class;
		Class<?> handle = InvocationHandler.class;
		
		Subject subject = (Subject)Proxy.newProxyInstance(classtype.getClassLoader(), sub.getClass().getInterfaces(), handler);
		subject.request();
		System.out.print("This is Dynamic Proxy");
	}
	
}
