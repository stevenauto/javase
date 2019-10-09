package com.steven.search_sort.arithmetic;

public class StrToInt {//把一个字符串转换成int类型，比如“123”  --》 123

    public static boolean valid = false;
    public static boolean coreFlag=false;
    public static int strToInt(String num){
        if(num == null || num.length() == 0){
            valid = false;
            return 0;
        }
        int a = 0;
        if(num.charAt(0)=='+'){//
            a = core(num,'+');
        }else if(num.charAt(0) == '-'){
            a = core(num,'-');
        }else if(num.charAt(0) >= '0' && num.charAt(0)<='9'){
            a = core(num,'0');
        }else{
            valid = false;
            return 0;
        }
        if(coreFlag){
            valid = true;
            return a;
        }else{
            valid = false;
            return 0;
        }
    }

    public static int core(String num, char flag){
        int i=0;
        if(flag == '+' || flag == '-'){
            i = 1;
        }

        int a = 0;
        int temp =a;
        for(;i<num.length();i++){
            if(!(num.charAt(i) >='0' && num.charAt(i)<='9' )){
                coreFlag = false;
                return 0;
            }
            temp =a ;
            if(flag != '-'){
                a = a*10;
                a += (int)(num.charAt(i)-'0');
                if( temp > a){//若当前数小，说明溢出
                    coreFlag = false;
                    return 0;
                }
            }else {
                a = a*10;
                a -= (int)(num.charAt(i)-'0');/////负数直接相减，不用乘以-1
                if( temp < a){//负数应该越加越小，若当前数比之前数大，说明溢出
                    coreFlag = false;
                    return 0;
                }
            }//
        }

        coreFlag = true;
        return a;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a = strToInt("-21474836"); //-2147483648
        if(valid){
            System.out.println(a);
        }
    }
}
