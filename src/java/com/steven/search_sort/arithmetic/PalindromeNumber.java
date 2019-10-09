package com.steven.search_sort.arithmetic;


import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        String str = "abcacba";
        int number = 1233210;
        if(isPalindrome(number)){
            System.out.println("The number is palindromernumber: "+number);
        }else if(isPalindrome(str)){
            System.out.println("The String is palindrome String: "+str);
        } else{
            System.out.println("What you input is not plindrome number or string");
        }

    }

    /**
     * 判断是否n是回文数
     * @param n
     * @return 如果是返回true，否则返回false
     */
    public static boolean isPalindrome(int n) {
        int m = 0;
        for (int i = n; i > 0; i /= 10) {
            int tail = i % 10;
            m = m * 10 + tail;
        }
        if(n == m) {
            return true;
        }
        return false;
    }
    /*
    if obj is number, it can convert into string and then handle it.
     */
    public static void isPalindrome(Object obj){
        String str= (int)obj+"";
        isPalindrome(str);


    }

    public static boolean isPalindrome(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();// 把字符串反转
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == sb.charAt(i)) {
                count++; //统计相同字符的个数
            }
        }
        if (count == str.length()) {
               return true;
        } else {
              return false;
        }

    }

}

