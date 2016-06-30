package com.steven.code8.annotation;

public @interface AnnotationTest
{
	/**
	 * 如果属性值是value,调用的时候可以@AnnotationTest(value = {"world", "ABCD"})
	 * 和@AnnotationTest({"world", "ABCD"})也就是value可以省略，但是如果不是value
	 * 不能省略。
	 * @return
	 */
	
	String[] value1() default "hello";
	EnumTest value2();
}

enum EnumTest
{
	Hello, World, Welcome;
}
