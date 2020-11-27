package com.steven.pattern.dynamicproxy.simple;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 实现动态代理，二个注意事项，第一个一定要实现InvocationHandler接口，
 * 这个方法是用来转给newProxyInstance的
 * 最后一个参数
 * @author root
 *
 */
public class Client
{
	public static void main(String[] args)
	{
		RealSubject realSubject = new RealSubject();

		InvocationHandler handler = new DynamicSubject(realSubject);

		Class<?> classType = handler.getClass();
		Class<?> class1Type = realSubject.getClass();
		
		System.out.println(classType);
		System.out.println(class1Type);
		/**下面的代码完成二件事情，1 在运行的时候给我们生成class，然后生成class的对象。
		 * 新生成一个代理实例，这个实例是在运行期间动态所生成那个类的实例（$Proxy0),生成的类的特点
		 * 是实现了realSubject.getClass().getInterfaces()接口（subject），所以
		 * 可以转换为(Subject一定要转换成接口类型，因为它不知道具体实现了谁)(实现了谁就可以转换为谁），
		 * 
		 * 在生成动态代理class的时候必须提供一组接口给它，然后该class就宣称它实现了这组接口like this
		 * public class $Proxy0 implements subject
		 * {
		 * }
		 * java中的每一个类都是通过classloader来加载的。classType.getClassLoader()
		 * classType1.getClassLoader(),一个加载器可以加载很多个类
		 * 由于代理和realsubject直接需要有相同的接口所以需要这句话realSubject.getClass().getInterfaces()
		 * 又由于proxy和realsubject实现了相同的接口所以可以由代理对象代理被代理对象
		 */

		Subject subject = (Subject) Proxy.newProxyInstance(classType
				.getClassLoader(), realSubject.getClass().getInterfaces(),
				handler);
		/**
		 * 每一个代理实例都有一个与之关联的InvocationHandler，当我们调用一个代理实例的某个方法时,
		 * 这个方法调用就会被编码并且派发到调用处理器的invoke方法上。
		 */
		subject.request();//当调用它的时候直接就转给handler，handler就会执行invoke方法

		System.out.println(subject.getClass());

	}
	
	
	
	
	
	
	
	
}
