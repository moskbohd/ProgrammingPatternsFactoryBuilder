package com.MoskBohd.Builder;

public class MyInteger {
    public static boolean isPrime(int num){
        if (num==1) {
            return true;
        } else {
            for(int i=2;i<=Math.sqrt(num);i++) {
                if (num%i==0) return false;
            }
        }
        return true;
    }
}
