package com.steven.search_sort.arithmetic;

import java.awt.*;

/**
 * Java实现KMP算法
 *
 * 思想：每当一趟匹配过程中出现字符比较不等，不需要回溯i指针，
 * 而是利用已经得到的“部分匹配”的结果将模式向右“滑动”尽可能远
 * 的一段距离后，继续进行比较。
 *
 * 时间复杂度O(n+m)
 *
 */
public class kmp2 {
    public static int kmp(String str, String dest,int[] next){//str文本串  dest 模式串
        for(int i = 0, j = 0; i < str.length(); i++){
            while(j > 0 && str.charAt(i) != dest.charAt(j)){
                j = next[j - 1];
            }
            if(str.charAt(i) == dest.charAt(j)){
                j++;
            }
            if(j == dest.length()){
                return i-j+1;
            }
        }
        return 0;
    }

    public static int[] kmpnext(String dest){
        int[] next = new int[dest.length()];
        next[0] = 0;
        for(int i = 1,j = 0; i < dest.length(); i++){
            while(j > 0 && dest.charAt(j) != dest.charAt(i)){
                j = next[j - 1];
            }
            if(dest.charAt(i) == dest.charAt(j)){
                j++;
            }
            next[i] = j;
        }
        return next;
    }
    public static void main(String[] args){
        String a = "ababa";
        String b = "ssdfgasdbababa";
        int[] next = kmpnext(a);
        int res = kmp(b, a,next);
        System.out.println(res);
        for(int i = 0; i < next.length; i++){
            System.out.print(next[i]+" ");
        }
        System.out.println();
        System.out.println(next.length);
    }
}
