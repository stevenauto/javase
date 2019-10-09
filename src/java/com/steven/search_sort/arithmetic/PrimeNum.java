package com.steven.search_sort.arithmetic;

import java.util.*;
/*
只需要找到j开平方的值就可以判定是不是素数，说到这里大家可能有点不太理解，例如：17这个数字
17开平方的值为4点多，当i的值无法被17整除的时候，他的平方根的值也一定不能被整除。大家仔细
考虑一下

 */

public class PrimeNum {
    public static void main(String[] args){

        //方法三
        TreeSet set = new TreeSet();
        boolean flag03;
        long start03 = System.currentTimeMillis();
        for(int i = 2; i < 100; i++){
            flag03 = false;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    flag03 = true;
                    break;
                }
            }
            if(flag03 == false){
                set.add(i);
            }
        }
        long end03 = System.currentTimeMillis();
        int tabline=0;
        System.out.println("The prime number is:");

        for(Iterator iter = set.iterator();iter.hasNext();){

            int number = (int)iter.next();
            tabline+=1;
            System.out.print(number+"  ");
            if(8 == tabline){
                System.out.println();
                System.out.println("===============================");
                tabline=1;
            }


        }
        System.out.println("经历的时间为：" + (end03 - start03));

    }
}
