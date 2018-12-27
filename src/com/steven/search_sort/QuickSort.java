package com.steven.search_sort;

public class QuickSort implements SortInterface{
	
	public QuickSort() {
		
	}
	
	public void sort(int[] array) {
		
		quick(array,0,array.length);
	}
	
	public void quick(int[] array,int low,int high) {
		if(low < high) {
			int middle=partition(array,low,high);
			quick(array,low,middle-1);
			quick(array,middle+1,high);
		}
	}
	
	private int partition(int[] array,int low,int high) {
		
		int seed=array[low];
		while(low < high) {
			
			while(low<high && array[low]<=seed) {
				low++;
			}
			array[low] = array[high];
			
			while(low<high && array[high]>=seed) {
				high--;
			}
			array[high]=seed;
			low=high;
			
		}
		return low;
		
	}

}
