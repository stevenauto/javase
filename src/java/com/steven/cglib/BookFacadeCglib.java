package com.steven.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class BookFacadeCglib implements MethodInterceptor{
	  
	private Object target;//ҵ������󣬹��������н���������ҵ�񷽷�����
	  
	    //�൱��JDK��̬�����еİ�
	    public Object getInstance(Object target) {  
	        this.target = target;  //��ҵ�����ֵ
	        Enhancer enhancer = new Enhancer(); //������ǿ��������������̬������
	        enhancer.setSuperclass(this.target.getClass());  //Ϊ��ǿ��ָ��Ҫ�����ҵ���ࣨ����Ϊ�������ɵĴ�����ָ�����ࣩ
	        //���ûص������ڴ����������з����ĵ��ã��������CallBack����Callback����Ҫʵ��intercept()����������
	        enhancer.setCallback(this); 
	       // ������̬��������󲢷���  
	       return enhancer.create(); 
	    }
	    // ʵ�ֻص����� 
	    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable { 
	        System.out.println("Ԥ��������������");
	        proxy.invokeSuper(obj, args); //����ҵ���ࣨ�����У��ķ���
	        System.out.println("���ú����������������");
	        return null; 
	    }

}

