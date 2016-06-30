package com.steven.pattern.defaultadapter;
/**使用场景是：不是所有的方法都对我们有用，我们只想实现其中一个方法，其它方法都在适配器里提供空实现。
 * 这是由于implements AbstractService就必须实现它所有的方法（否则concreteService页是抽象类），如果concreteService直接implements
 * 就会导致在concreteService中有很多不必要的方法。
 * 
 * @author root
 *
 */
public class ServiceAdapter implements AbstractService
{
	@Override
	public void service1()
	{
		
	}
	
	@Override
	public void service2()
	{
		
	}
	
	@Override
	public void service3()
	{
		
	}
}
