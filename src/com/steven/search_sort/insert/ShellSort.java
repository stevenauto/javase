package com.steven.search_sort.insert;

import java.util.Arrays;

import com.steven.search_sort.SortInterface;

public class ShellSort implements SortInterface {

	public ShellSort() {

	}

	public void shellSort(int[] array) {

		int j = 0;

		int temp = 0;

		for (int increment = array.length / 2; increment > 0; increment /= 2) {

			for (int i = increment; i < array.length; i++) {

				temp = array[i];

				for (j = i - increment; j >= 0; j -= increment) {

					if (temp < array[j]) {

						array[j + increment] = array[j];

					} else {

						break;

					}

				}

				array[j + increment] = temp;

			}

		}
		System.out.println(Arrays.toString(array));

	}

	@Override
	public void sort(int[] array) {
		// TODO Auto-generated method stub
		shellSort(array);

	}

}
