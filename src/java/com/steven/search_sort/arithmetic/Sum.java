package com.steven.search_sort.arithmetic;

import java.util.HashMap;

public class Sum {

    public static void main(String[] args) {
        int[] nums = {7,1,3,2,11,34,6,9,32,8};
        int target = 13;
        // 结果数组
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int two = target - nums[i];
            // 如果存在第二个数的数组下标&&结果的两个数不是同一个数的值
            if (map.containsKey(two) && target != 2 * two ) {
                // 返回找到的两个数的数组下标
                if(map.get(two) > i){
                    System.out.println("The sum 13 index is:"+i+" & "+ map.get(two));
                }


            }
        }
    }
}

