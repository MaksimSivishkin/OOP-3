package ru.corses.main;

import ru.corses.math.Fraction;
import ru.corses.math.Math1;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class Start {
    public static void main(String[] args) {
        String x = "5";
        String y = "5";
        int z = parseInt(x);
        int q = parseInt(y);
        int s = (int) pow( z, q);
        System.out.println(s);


    }
}

