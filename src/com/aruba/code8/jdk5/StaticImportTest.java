package com.aruba.code8.jdk5;
/*import com.aruba.code8.common��ʱ��
 * int a=Common.AGE.
 * jdk5��ʼʹ��import static com.aruba.code8.common.Common.AGE�����뵼�뵽�������߳�Ա������
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
