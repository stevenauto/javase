package com.aruba.code8.jdk5;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetDemo2
{
	public static void main(String[] args)
	{
//		创建一个没有内容的枚举集合，
		EnumSet<FontConstant> enumSet = EnumSet.noneOf(FontConstant.class);
		
		enumSet.add(FontConstant.Bold);
		enumSet.add(FontConstant.Italilc);
		
		showEnumSet(enumSet);
	}
	
	
	public static void showEnumSet(EnumSet<FontConstant> enumSet)
	{
		for(Iterator<FontConstant> iter = enumSet.iterator(); iter.hasNext();)
		{
			System.out.println(iter.next());
		}
	}
	
	
}
