package com.Coding.Recursion;

public class Print1ToN {
    public static void main(String[] args) {
            Print1ToN print = new Print1ToN();
            // print.print1ToN(5);
            print.printNTo1(5);
    }
        void  print1ToN( int n){
            if (n==1) {
                System.out.println(n);
                return;
            }
            print1ToN(n-1);
            System.out.println(n);
        }
        void  printNTo1( int n){
            if (n==1) {
                System.out.println(n);
                return;
            }
            System.out.println(n);
            printNTo1(n-1);

        }
}
