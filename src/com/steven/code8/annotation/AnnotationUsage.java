package com.steven.code8.annotation;

@AnnotationTest(value2 = EnumTest.Welcome)
public class AnnotationUsage
{
	/**value1 = {"world", "ABCD"},һ���ַ�����ʱ�����д��value1 = {"world"}��value1 = "world"
	 * 
	 */
	@AnnotationTest(value1 = {"world", "ABCD"}, value2 = EnumTest.World)
	public void method()
	{
		System.out.println("usage of annotation");
	}
	
	public static void main(String[] args)
	{
		AnnotationUsage usage = new AnnotationUsage();
		
		usage.method();
	}
}
