package com.steven.search_sort.arithmetic;

public class RepeatChar {

    public static void main(String[] args) {

        String str = "123wabdsafffrrrtttlkjhy";
        RepeatChar test = new RepeatChar();
        int p = test.Method(str);
        String result = str.charAt(p) + "";
        System.out.println("The first repeated char is:"+result);

    }

    /**
     * 方法
     * */

    public int Method(String str) {
        int position = -1;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char c=str.charAt(i);
            if ((str.indexOf(c, i + 1)) != -1) {
                position = i;
                break;
            }
        }
        return position;
    }

}
