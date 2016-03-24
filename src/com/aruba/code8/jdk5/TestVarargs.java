package com.aruba.code8.jdk5;

public class TestVarargs
{
	/**当有多个参数时，可变参数必须放在最后，int...和int[]一样但是如果定义成int[]，调用的
	 *时候就必须穿数组不能传 sum("b", 1, 2, 3, 4);
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
