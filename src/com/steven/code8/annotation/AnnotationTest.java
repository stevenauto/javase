package com.steven.code8.annotation;

public @interface AnnotationTest
{
	/**
	 * �������ֵ��value,���õ�ʱ�����@AnnotationTest(value = {"world", "ABCD"})
	 * ��@AnnotationTest({"world", "ABCD"})Ҳ����value����ʡ�ԣ������������value
	 * ����ʡ�ԡ�
	 * @return
	 */
	
	String[] value1() default "hello";
	EnumTest value2();
}

enum EnumTest
{
	Hello, World, Welcome;
}
