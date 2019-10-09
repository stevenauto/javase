package com.steven.search_sort.choose;

import java.util.Arrays;

import com.steven.search_sort.SortInterface;

public class MaxHeap implements SortInterface {
	
	protected int array[];
	protected int heapsize;

	// constructors
	public MaxHeap() {
	}

	/* parent/left child/right child	 */
	protected int parent(int i) {
		return (i - 1) / 2;
	}

	protected int left(int i) {
		return 2 * i + 1;
	}

	protected int right(int i) {
		return 2 * i + 2;
	}

	/* ������������ */
	protected void maxHeapify(int i) {
		int l = left(i);
		int r = right(i);
		int largest = i;
		if (l <= heapsize - 1 && array[l] > array[i])
			largest = l;
		if (r <= heapsize - 1 && array[r] > array[largest])
			largest = r;
		if (largest != i) {
			int temp = array[i];
			// swap
			array[i] = array[largest];
			array[largest] = temp;
			this.maxHeapify(largest);
		}
	}

	/*
	 * ����һ�������ѡ���
	 */
	public void buildMaxHeap(int[] array) {
		this.array = array;
		this.heapsize = array.length;

		for (int i = parent(heapsize - 1); i >= 0; i--)
			maxHeapify(i);
	}

	public void heapsort(int[] array) {
		buildMaxHeap(array);

		int step = 1;
		for (int i = array.length - 1; i > 0; i--) {
			int temp = array[i];
			array[i] = array[0];
			array[0] = temp;
			heapsize--;
			System.out.println("Step: " + (step++) + Arrays.toString(array));
			maxHeapify(0);
		}
	}

	@Override
	public void sort(int[] array) {
		// TODO Auto-generated method stub
		heapsort(array);

	}

}
