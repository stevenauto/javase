package com.steven.search_sort;

import java.util.Arrays;

import com.steven.search_sort.insert.*;
import com.steven.search_sort.swap.*;


public class Client {

	public static void main(String[] args) {
		
		int array[] = {44,22,2,32,54,22,88,77,99,11};
		//radix sort only for 4 digit
		int radixarray[] = {4421,2211,2324,32124,5412,2212,8816,7723,2112,1112};
		Environment env = new Environment();
//Simple Sort implements that include BubbleSort,ChooseSort,InsertSort		
		
/*		BubbleSort st = new BubbleSort();
		env.SetSortInterface(st);
		env.sort(array);
		for(int i=0; i<array.length;i++) {
			System.out.print(array[i]+" ");
		}*/
		/*ChooseSort cs = new ChooseSort();
		env.SetSortInterface(cs);
		env.sort(array);*/
		
		
		/*QuickSort qs = new QuickSort();
		env.SetSortInterface(qs);
		env.sort(array);*/
		
		/*InsertSort is = new InsertSort();
		env.SetSortInterface(is);
		env.sort(array);*/
		
/*		ShellSort ss = new ShellSort();
		env.SetSortInterface(ss);
		env.sort(array);*/
		
		/*MergeSort ms = new MergeSort();
		env.SetSortInterface(ms);
		env.sort(array);
		System.out.println(Arrays.toString(array));*/
		
		RadixSortfixlength rs= new RadixSortfixlength();
		env.SetSortInterface(rs);
		env.sort(radixarray);
		
/*		System.out.println("Input: " + Arrays.toString(array));
		MaxHeap mh =new MaxHeap();
		env.SetSortInterface(mh);
		env.sort(array);
		System.out.println("Output: " + Arrays.toString(array));*/
		
		/*BinarySearch bs = new BinarySearch();
		int key=88;
		int index=bs.binarysearch(array, key, 0, array.length-1);
		System.out.println("index is:"+index);*/

	}

}
