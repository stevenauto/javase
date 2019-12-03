package com.steven.search_sort.arithmetic;
/*
 a seq list increment first and then decrement ,find peak number
 */

class Peaknum {

    public static void main(String[] args){
        int data[] = new int[]{1,3,5,7,8,11,9,6,5,3,0};
        Peaknum pq =new Peaknum();
        int peaknum = pq.findPeakElement(data);
        System.out.println("The peak number is :"+peaknum);
    }
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
