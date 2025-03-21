package ru.corses.main;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;


public class Start {
    public static void main(String[] args) {
        System.out.println(myPow("5","5"));
    }
    public static int myPow(String x, String y){
        int z = parseInt(x);
        int q = parseInt(y);
        int s = (int) pow( z, q);
        return s;
    }

}

