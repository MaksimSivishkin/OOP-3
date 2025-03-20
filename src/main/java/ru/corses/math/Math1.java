package ru.corses.math;

public class Math1 {
    static int nok(int a, int b){
        return a*b/nod(a,b);
    }
    static int nod(int a, int b){
        if(b==0){
            return a;
        }
        return nod(b,a%b);
    }
    public static double flInt(int a, int b){
        double c=((double) a/ (double) b);
        return c;
    }
}
