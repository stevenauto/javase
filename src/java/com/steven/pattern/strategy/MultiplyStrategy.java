package com.steven.pattern.strategy;

public class MultiplyStrategy implements Strategy
{
	public int calculate(int a, int b)
	{
		return a * b;
	}
}
