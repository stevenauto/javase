package steven.search_sort.arithmetic;


class Peakseq {

    public int findPeakElement(int[] nums) {
        return findPeakElement(nums,0,nums.length);
    }

    public int findPeakElement(int[] nums,int start,int end){
        int mid = (start+end)/2;
        int leftvalue = nums[mid-1];
        int midValue = nums[mid];
        int rightValue = nums[mid+1];
        //找到数据
        if(leftvalue < midValue && midValue>rightValue){
            return midValue;
        }else if(leftvalue>midValue){//去左半区域查找
            return findPeakElement(nums,start,mid-1);
        }else if(midValue<rightValue){//去右半区域查找
            return findPeakElement(nums,mid+1,end);
        }else{
            return -1;
        }


    }
}
