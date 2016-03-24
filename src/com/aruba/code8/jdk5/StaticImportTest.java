package com.aruba.code8.jdk5;
/*import com.aruba.code8.common的时候
 * int a=Common.AGE.
 * jdk5开始使用import static com.aruba.code8.common.Common.AGE，必须导入到方法或者成员变量。
 * 
 * 
 */
import static com.aruba.code8.common.Common.AGE;
import static com.aruba.code8.common.Common.output;

public class StaticImportTest
{
	public static void main(String[] args)
	{
		int a = AGE;
		
		System.out.println(a);
		
		output();
	}
}
