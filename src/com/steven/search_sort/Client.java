package com.steven.search_sort;

public class Client {

	public static void main(String[] args) {
		
		int array[] = {44,22,2,32,54,22,88,77,99,11};
		Environment env = new Environment();
		BubbleSort st = new BubbleSort();
//		env.SetSortInterface(st);
//		env.sort(array);
//		for(int i=0; i<array.length;i++) {
//			System.out.print(array[i]+" ");
//		}
		QuickSort qs = new QuickSort();
		env.SetSortInterface(qs);
		env.sort(array);
		for(int i=0; i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		BinarySearch bs = new BinarySearch();
		int key=88;
		int index=bs.binarysearch(array, key, 0, array.length-1);
		System.out.println("index is:"+index);

	}

}
