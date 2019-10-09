package com.steven.interview;

import java.util.Arrays;
import java.util.HashSet;

public class ExpectSumOfTwoNumber {
/*����һ��

�Ƚ�����������������֮��������ָ��left��right��leftָ�������������еĵ�һ��Ԫ�أ�rightָ�������������е����һ��Ԫ��

�� arr[left]+arr[right]�� ������Ԫ�رȽϣ���ǰ�ߴ�right--����ǰ��С��left++������ȣ����ҵ���һ������֮��Ϊָ��ֵ��Ԫ�ء�

�˷������������������ʱ�临�Ӷ�ΪO(NlogN)������֮��ɨ������������ͱȽϵ�ʱ�临�Ӷ�ΪO(N)�����ܵ�ʱ�临�Ӷ�ΪO(NlogN)���ռ临�Ӷ�ΪO(1)

 * 
 * 
 * 
 */
    
    public static void expectSum_bySort(int[] arr, int expectSum)
    {
        if(arr == null || arr.length == 0)
            return;
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        
        while(left < right)
        {
            if(arr[left] + arr[right] > expectSum)
                right--;
            else if(arr[left] + arr[right] < expectSum)
                left++;
            else//equal
            {
                System.out.println(arr[left] + " + " + arr[right] + " = " + expectSum); 
                left++;
                right--;
            }
        }
    }
    
    
    public static void expectSum_bySet(int[] arr, int expectSum)
    {
        if(arr == null || arr.length == 0)
            return;
        HashSet<Integer> intSets = new HashSet<Integer>(arr.length);
        
        int suplement;
        for (int i : arr)
        {
            suplement = expectSum - i;
            if(!intSets.contains(suplement)){
                intSets.add(i);
            }else{
                System.out.println(i + " + " + suplement + " = " + expectSum);
            }
        }
    }
    
 /*���α����������飬�����������е�ÿһ��Ԫ�أ��������suplement��expectedSum-arr[i]��.suplement����ָ����ֵ��ȥ������Ԫ�ء�

�����Ԫ�ص� suplement����HashSet�У��򽫸�Ԫ����ӵ�HashSet��

�����Ԫ�ص�suplement��HashSet�У�˵���Ѿ��ҵ���һ������֮��Ϊָ��ֵ��Ԫ�ء�

�÷���ʹ����HashSet���ʿռ临�Ӷ�ΪO(N)������ֻ��Ҫɨ��һ���������飬��ʱ�临�Ӷ�ΪO(N)
  * 
  * 
  */
    
    //hapjin test
    public static void main(String[] args) {
        int[] arr = {2,7,4,9,3};
        int expectSum = 11;
        expectSum_bySet(arr, expectSum);
        System.out.println("************");
        expectSum_bySort(arr, expectSum);
        System.out.println("----------------");
        int[] arr2 = {3,7,9,1,2,8,5,6,10,5};
        int expectSum2 = 10;
        expectSum_bySet(arr2, expectSum2);
        System.out.println("**********");
        expectSum_bySort(arr2, expectSum2);
    }
}
