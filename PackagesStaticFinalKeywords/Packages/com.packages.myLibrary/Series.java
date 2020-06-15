//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.myLibrary;

public class Series {
    public Series() {
    }

    public static long nSum(int n) {
        return (long)(n * (n + 1) / 2);
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1L;
        } else {
            long fact = 1L;

            for(int i = 1; i <= n; ++i) {
                fact *= iL;
            }

            return fact;
        }
    }

    public static long fibonacci(int n) {
        if (n == 0) {
            return 0L;
        } else if (n == 1) {
            return 1L;
        } else {
            long nMinus = 1L;
            long nMinusTwo = 0L;
            long fib = 0L;

            for(int i = 1; i < n; ++i) {
                fib = nMinusTwo + nMinus;
                nMinusTwo = nMinus;
                nMinus = fib;
            }

            return fib;
        }
    }
}
