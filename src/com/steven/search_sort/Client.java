package com.steven.search_sort;

public class Client {

	public static void main(String[] args) {
		
		int array[] = {44,22,2,32,54,22,88,77,99,11};
		Environment env = new Environment();
		SortInterface st = new QuickSort();
		env.SetSortInterface(st);
		env.sort(array);

	}

}
