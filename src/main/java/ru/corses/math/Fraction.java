package ru.corses.math;

public class Fraction extends Number {
    private int numerator;
    private int denominator;


    public Fraction(int numerator){
        this.numerator=numerator;
        this.denominator=1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        if(denominator<0){
            throw new IllegalArgumentException("Denominator must be positive");
        }
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if(denominator<0){
            throw new IllegalArgumentException("Denominator must be positive");
        }
        this.denominator = denominator;
    }
    public Fraction sum(Fraction fraction) {
        Fraction result = sum(fraction, this);
        return result;
    }

    public static Fraction sum(Fraction a, Fraction b){
        int cDenominator = Math1.nok(a.denominator, b.denominator);
        int cNumerator = a.numerator*(cDenominator/a.denominator)+b.numerator*(cDenominator/ b.denominator);
        Fraction c = new Fraction(cNumerator, cDenominator);
        return c;
    }
    public static Fraction min(Fraction a, Fraction b){
        int cDenominator = Math1.nok(a.denominator, b.denominator);
        int cNumerator = a.numerator*(cDenominator/a.denominator)+b.numerator*(cDenominator/ b.denominator);
        Fraction c = new Fraction(cNumerator, cDenominator);
        return c;
    }

    @Override
    public String toString() {
        return String.format("%s/%s", numerator,denominator);
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }

}

