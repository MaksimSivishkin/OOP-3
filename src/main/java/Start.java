public class Start {
    public static void main(String[] args) {
        Fraction fraction = new Fraction(1,3);
        Fraction fraction1 = new Fraction(1,3);
        Fraction fraction2 = new Fraction(2);

        System.out.println(2+Math1.flInt(3,5)+2.3);
        System.out.println(3.6+Math1.flInt(49, 12)+3+Math1.flInt(3,2));
        System.out.println(Math1.flInt(1,3)+1);
    }
}
interface Measurable{
    double getLine(double x1, double y1, double x2, double y2);
}
