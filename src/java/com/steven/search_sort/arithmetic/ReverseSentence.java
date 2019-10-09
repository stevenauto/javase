package com.steven.search_sort.arithmetic;


public class ReverseSentence {

    public static void main(String[] args){
        String str = "I am a super hero , You are such idiot , so please do not talk to me ."+
                " he is smart boy , she is not so beautify . ";
        String nstr = Reverse(str);
        System.out.println(nstr);
    }

    public static String Reverse(String str) {
        if(str == null){ return null;}
        if(str.trim().equals("")){
            return str;
        }
        String string = str;
        String[] strings = string.split(" ");
        StringBuilder sBuilder = new StringBuilder();
        for (int i = strings.length-1 ; i>=0;i--) {
            if(i == 0){
                sBuilder.append(strings[i]);
            }else {
                sBuilder.append(strings[i]);
                sBuilder.append(" ");
            }
        }
        String string2 = sBuilder.toString();
        return string2;
    }
}
