package com.steven.clone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n + 1];
        int[] opt = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            a[i] = scanner.nextInt();
            opt[i] = a[i];
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (a[i] > a[j]) {
                    int A = opt[j] + a[i];
                    int B = opt[i];
                    opt[i] = Math.max(A, B);
                }
            }
        }
        int max = 0;
        for (int x : opt) {
            if (x > max)
                max = x;
        }
        System.out.println(max);
    }
}