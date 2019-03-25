package com.steven.search_sort;

public class QuickSort implements SortInterface
{

	public QuickSort()
	{

	}

	public void sort(int[] array)
	{
		quicksort(array, 0, array.length - 1);

	}

	public void quicksort(int[] array, int low, int high)
	{
		if (low < high)
		{
			int start = low;
			int end = high;
			int key = array[start];
			while (start < end)
			{
				while (start < end && array[end] >= key)
				{
					end--;
				}

				array[start] = array[end];

				while (start < end && array[start] <= key)
				{
					start++;
				}
				array[end] = array[start];
			}
			/*
			 * start=end
			 */
			array[start] = key;
			quicksort(array, low, start - 1);
			quicksort(array, start + 1, high);
		}
	}

}
