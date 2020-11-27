package com.steven.search_sort.swap;

import com.steven.search_sort.SortInterface;

public class BubbleSort implements SortInterface
{
	
	public BubbleSort() {
		
	}
	public void sort(int[] array)
	{
		for(int i = 0; i < array.length - 1; i++)
		{
			for(int j = 0; j < array.length - i - 1; j++)
			{
				if(array[j] > array[j + 1])
				{
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
				
				
			}

			System.out.println("This is " + (i + 1) + " round seq");

			for(int k = 0; k < array.length; k++)
			{
				System.out.print(array[k] + " ");
			}

			System.out.println();

		}
	}
}
