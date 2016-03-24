package com.aruba.code8.jdk5;

public class TestVarargs
{
	/**���ж������ʱ���ɱ��������������int...��int[]һ��������������int[]�����õ�
	 *ʱ��ͱ��봩���鲻�ܴ� sum("b", 1, 2, 3, 4);
	 * @param str
	 * @param nums
	 * @return
	 */
	private static int sum(String str, int... nums)
	{
		System.out.println(str);

		int sum = 0;

		for (int num : nums)
		{
			sum += num;
		}

		return sum;
	}

	public static void main(String[] args)
	{
		int result = sum("a", new int[] { 1, 2 });

		System.out.println(result);

		result = sum("b", 1, 2, 3, 4);

		System.out.println(result);

	}
}
