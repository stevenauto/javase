package com.steven.search_sort.arithmetic;

import java.util.Scanner;

/**
 * @Author steven
 * create 12/3/2019 9:35 AM
 **/
public class JumpFloor {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result=0;
        while(num!=-1){
            result = sum(num);
            num=sc.nextInt();
            System.out.println("The jump time is:"+result);
        }



    }

    public static int sum(int num){

        if(num==1){
            return 1;
        } else if(num==2){
            return 2;
        } else {

            return sum(num-1)+sum(num-2);
        }
    }

}
