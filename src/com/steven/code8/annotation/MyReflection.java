package com.steven.code8.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MyReflection
{
	public static void main(String[] args) throws Exception
	{
		MyTest myTest = new MyTest();
		
		Class<MyTest> c = MyTest.class;
		
		Method method = c.getMethod("output", new Class[]{});
		
		if(method.isAnnotationPresent(MyAnnotation.class))
		{
			method.invoke(myTest, new Object[]{});
			
			MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
			
			String hello = myAnnotation.hello();
			String world = myAnnotation.world();
			
			System.out.println(hello + ", " + world);
		}
		
		Annotation[] annotations = method.getAnnotations();
		
		for(Annotation annotation : annotations)
		{
//			annotation.annotationType()返回anotation的class对象，下面的输出结果是
//			java.lang.Deprecated和java.lang.annotation.Retention.Myannotation
			System.out.println(annotation.annotationType().getName());
			
		}
	}
}
