package com.steven.search_sort;

import java.util.Arrays;

public class MaxHeap implements SortInterface
{
	protected int A[];
	protected int heapsize;

	// constructors
	public MaxHeap()
	{
	}

	public MaxHeap(int A[])
	{
		buildMaxHeap(A);
	}
/*parent/left child/right child
 * 
 */
	protected int parent(int i)
	{
		return (i - 1) / 2;
	}

	protected int left(int i)
	{
		return 2 * i + 1;
	}

	protected int right(int i)
	{
		return 2 * i + 2;
	}
	/*保持最大堆特性
	 * 
	 */
	protected void maxHeapify(int i){
	    int l = left(i);
	    int r = right(i);
	    int largest = i;
	    if (l <= heapsize - 1 && A[l] > A[i])
	        largest = l;
	    if (r <= heapsize - 1 && A[r] > A[largest])
	        largest = r;
	    if (largest != i) {
	        int temp = A[i];
	        // swap
	        A[i] = A[largest];
	        A[largest] = temp;
	        this.maxHeapify(largest);
	    }
	}
	/*
	 *  构造一个“最大堆”：
	 */
	public void buildMaxHeap(int [] A){
	    this.A = A;
	    this.heapsize = A.length;
	    
	    for (int i = parent(heapsize - 1); i >= 0; i--)
	        maxHeapify(i);        
	}
	
	public void heapsort(int [] A){
	    buildMaxHeap(A);
	    
	    int step = 1;
	    for (int i = A.length - 1; i > 0; i--) {
	        int temp = A[i];
	        A[i] = A[0];
	        A[0] = temp;
	        heapsize--;
	        System.out.println("Step: " + (step++) + Arrays.toString(A));
	        maxHeapify(0);
	    }        
	}

	@Override
	public void sort(int[] array)
	{
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) {
	    //a sample input
	    int [] A = {3, 7, 2, 11, 3, 4, 9, 2, 18, 0};
	    System.out.println("Input: " + Arrays.toString(A));
	    MaxHeap maxhp = new MaxHeap();
	    maxhp.heapsort(A);
	    System.out.println("Output: " + Arrays.toString(A));

	}

}
