package com.steven.pattern.strategy;

public class Client
{
	public static void main(String[] args)
	{
		int number1=15;
		int number2=12;
		AddStrategy addStrategy = new AddStrategy();

		Environment environment = new Environment(addStrategy);

		System.out.println("3+4="+environment.calculate(number1,number2));

		SubtractStrategy subtractStrategy = new SubtractStrategy();

		environment.setStrategy(subtractStrategy);

		System.out.println("3-4="+environment.calculate(number1,number2));

		MultiplyStrategy multiplyStrategy = new MultiplyStrategy();

		environment.setStrategy(multiplyStrategy);

		System.out.println("3*4="+environment.calculate(number1,number2));

		DivideStrategy divideStrategy = new DivideStrategy();

		environment.setStrategy(divideStrategy);

		System.out.println("3/4="+environment.calculate(number1,number2));

	}
}
