package steven.search_sort.arithmetic;

import java.util.Arrays;
import java.util.Scanner;

public class kmp {

    public static void  main(String[] args){


        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        System.out.println("Input String is:"+string);
        String newstring =string+ShortestRepeatString(string);
        System.out.println("Ouput String is:"+newstring);


    }

    public static String ShortestRepeatString(String str){

        int[] next = new int[str.length()+1];
        Arrays.fill(next,0);
        next[0]=-1;
        next[1]=0;

        for(int i =2;i<next.length;i++){

            char pre = str.charAt(i-1);
            int k = next[i-1];

            while(k != -1){
                if (str.charAt(k) == pre){
                    next[i]=next[i-1]+1;
                    break;
                }

                k=next[k];
            }
        }
        return str.substring(next[str.length()]);

    }


}
