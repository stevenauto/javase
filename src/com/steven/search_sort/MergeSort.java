package com.steven.search_sort;

import java.util.Arrays;

public class MergeSort implements SortInterface {

	public void merge(int[] array, int low, int mid, int high) {

		int[] temp = new int[high - low + 1];

		int l= low;// 左指针

		int r = mid + 1;// 右指针

		int k = 0;

		// 把较小的数先移到新数组中

		while (l <= mid && r <= high){

			if (array[l] < array[r]) {

				temp[k++] = array[l++];

			} else {

				temp[k++] = array[r++];

			}

		}

		// 把左边剩余的数移入数组

		while (l <= mid) {

			temp[k++] = array[l++];

		}

		// 把右边边剩余的数移入数组

		while (r <= high) {

			temp[k++] = array[r++];

		}

		// 把新数组中的数覆盖nums数组

		for (int k2 = 0; k2 < temp.length; k2++){

			array[k2 + low] = temp[k2];

		}

	}

	public void mergeSort(int[] array, int low, int high) {

		int mid = (low + high) / 2;

		if (low < high) {

			mergeSort(array, low, mid);//左边

			mergeSort(array, mid + 1, high);//右边

			merge(array, low, mid, high);//左右归并

		}

	}

	public MergeSort() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sort(int[] array) {
		// TODO Auto-generated method stub
		mergeSort(array,0,array.length-1);

	}

}
