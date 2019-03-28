package com.steven.search_sort;

import java.util.LinkedList;
import java.util.Queue;

public class RadixSort implements SortInterface {

	public  void radixSort(int[] array){

		String temp;

		int numObj;

		int digit,num;

		Queue<Integer>[] digitQueue =(LinkedList<Integer>[])(new LinkedList[10]);

		for(int digitVal = 0; digitVal <= 9;digitVal++){

			digitQueue[digitVal] =(Queue<Integer>)(new LinkedList<Integer>());

		}

		//sort

		for(int pos = 0; pos <= 3; pos++){

			for(int scan = 0; scan <array.length; scan++){

				temp = String.valueOf(array[scan]);

				digit =Character.digit(temp.charAt((3 - pos)), 10);

				digitQueue[digit].add(newInteger(array[scan]));

		        }

		        num = 0;

		        for(int digitVal = 0; digitVal <= 9;digitVal++){

		           while(!(digitQueue[digitVal]).isEmpty()){

		                numObj =digitQueue[digitVal].remove();

		                array[num] = numObj;

		                num++;

		            }

		        }

		    }

		}
	public RadixSort() {
		
	}
	@Override
	public void sort(int[] array) {
		// TODO Auto-generated method stub

	}

}
