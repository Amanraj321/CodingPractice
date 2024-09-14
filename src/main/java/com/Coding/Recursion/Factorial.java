package com.Coding.Recursion;

public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.fact(5));
    }

    int fact(int n) {
        if (n == 1) {
            //System.out.println(n);
            return n;
        }
        return (n*fact(n-1));


    }
}
