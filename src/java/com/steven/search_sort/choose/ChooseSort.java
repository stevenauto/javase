package com.steven.search_sort.choose;

import java.util.Arrays;

import com.steven.search_sort.SortInterface;

/**
 * 选择排序
 * 
 * @author Steven
 *
 */
public class ChooseSort implements SortInterface {

	public ChooseSort() {
	}

	/**
	 * 选择排序算法
	 */
	public void chooseSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int minIndex = i;
			for (int j = minIndex + 1; j < array.length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			if(i !=minIndex) {
				int temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
			}

		}
		System.out.println(Arrays.toString(array));
	}

	@Override
	public void sort(int[] array) {
		// TODO Auto-generated method stub
	    chooseSort(array);

	}
}
