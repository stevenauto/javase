package com.steven.pattern.dynamicproxy.simple;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.steven.pattern.proxy.RealSubject;

/**
 * 该代理类的内部属性是Object类型，实际使用的时候通过该类的构造方法传递进来一个对象
 * 此外，该类还实现了invoke方法，该方法中的method.invoke其实就是调用被代理对象的将要
 * 执行的方法，方法参数是sub，表示该方法从属于sub，通过动态代理类，我们可以在执行真实对象的方法前后
 * 加入自己的一些额外方法。
 *实现动态代理必须要实现InvocationHandler
 */

public class DynamicSubject implements InvocationHandler
{
	/**对真实对象的引用，因为他是一个动态代理，private RealSubject realSubject，这个写法不行
	 * 因为不知道真实对象的类型，故写成Object sub
	 */
	private Object sub;
	
	public DynamicSubject(Object obj)
	{
		this.sub = obj;
	}
	/**处理代理实例上的方法调用并把结果返回来，当我们调用一个方法的时候并不是由代理来完成而是由代理的
	 * InvocationHandler的invoke方法帮助完成。
	 * Object proxy（调用那一个代理实例的方法）Method method（method实例对应于代理实例上的被
	 * 调用的方法）Object[] args是方法所需要的参数
	 * 
	 */
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable
	{
		System.out.println("before calling: " + method);
		
		method.invoke(sub, args);//相当于静态代理的realSubject.request()
		
		System.out.println(args == null);
		
		System.out.println("after calling: " + method);
		
		return null;
	}
}
