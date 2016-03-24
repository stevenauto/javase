public class StringTest
{
	public static void main(String[] args)
	{
		String str = new String("aa");
		String str2 = new String("aa");

		System.out.println(str.equals(str2));
		//所有的string对象都放在StringPool中，str3创建时发现池中没有aa，所以添加aa，str4先检查池中有没有，发现有所以返回aa的地址给str4，所以str3和str4指向同一个对象。
		String str3 = "aa";
		String str4 = "aa";

		System.out.println(str3.equals(str4));

		System.out.println("-----------------");

		Object object = new Object();
		Object object2 = new Object();

		System.out.println(object.equals(object2));
		System.out.println(object.equals(object));

		System.out.println("-----------------");


	}
}
