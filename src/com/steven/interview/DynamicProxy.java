package com.steven.interview;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler{
	
	public Object obj;
	
	public DynamicProxy(Object sub) {
		this.obj=sub;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		method.invoke(obj,args);
		return null;
	}
	

}
