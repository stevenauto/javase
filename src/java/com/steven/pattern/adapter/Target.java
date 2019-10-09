package com.steven.pattern.adapter;
/*
Adaptee 需要被适配的对象或类型，相当于插头。
Adapter 连接目标和源的中间对象，相当于插头转换器。
Target  期待得到的目标，相当于插座
 */
public interface Target
{
	public void method1();
	public void method2();
}
