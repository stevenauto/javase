package steven.search_sort.search;

public class BinarySearch {

	public void BinarySearch() {
		
	}
	
	public int binarysearch(int[] array,int key,int low,int high) {
		
		if(key<array[low] || key> array[high] || low >high) {
			return -1;
		}
		
		int middle=(low+high)/2;
		if(array[middle]>key) {
			
			return binarysearch(array,key,low,middle-1);
			
		} else if(array[middle]<key) {
			
			return binarysearch(array,key,middle+1,high);
			
		} else {
			return middle;
		}
	}
}
