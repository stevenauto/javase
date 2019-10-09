package com.steven.search_sort.arithmetic;

import java.util.Scanner;

public class Maxseq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (!sc.hasNext("0")) {//当输入不为0时
            int n = sc.nextInt();
            int[] arr = new int[10002];
            int[] dp = new int[10002];//dp[i]代表的是以arr[i]结尾的连续子序列的最大和
            boolean flag = true;//定义一个标志，用来表示输入是否为正数
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();//输入序列
                arr[i] = a;
                if (arr[i] > 0)
                    flag = false;//对序列中的元素进行判断，是否为负数
            }
            if (flag) {//如果全部为负数
                System.out.println(0 + " " + arr[0] + " " + arr[n - 1]);//输出0 序列首位和最后一位
                continue;//跳过此次循环
            }

            //如果序列中不是全部为负数，则用dp进行求解
            dp[0] = arr[0];

            for (int i = 1; i < n; i++) {//状态转移方程
                dp[i] = Math.max(arr[i], dp[i - 1] + arr[i]);
            }
            int k = 0;
            int num = 0, start = 0, end = 0;
            for (int i = 0; i < n; i++) {//对dp数组进行遍历，找出其中最大的一个，并加以标记
                if (dp[i] > dp[k]) {//因为是从dp数组第一个元素开始寻找，所以即使有两个相同的最大和，也能保证子序列是最靠前的
                    k = i;
                }

            }

            for (int i = k; i >= 0; i--) {//从k开始向前寻找和为dp[k]的子序列的首元素，并用start来标记
                num += arr[i];
                if (num == dp[k]) {
                    start = arr[i];
                    end = arr[k];
                    break;
                }
            }
            System.out.println(dp[k] + " " + start + " " + end);
        }

    }
}
