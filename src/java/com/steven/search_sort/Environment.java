package com.steven.search_sort;

public class Environment {
	private SortInterface sortinterface;
	
	public Environment(SortInterface sortinterface) {
		
		this.sortinterface=sortinterface;
		
	}
	
	public Environment() {
		
	}
	
	public void SetSortInterface(SortInterface sortinterface) {
		
		this.sortinterface=sortinterface;
	}
	
	public void sort(int[] array) {
		this.sortinterface.sort(array);
	}

}
