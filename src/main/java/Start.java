

public class Start {
    public static void main(String[] args) {
        Point point = new Point(1,3);
        Point point1 = new Point(5,8);
        Point point2 = new Point(10,11);
        Point point3 = new Point(15,19);

        Line line = new Line(point, point1);
        Line line1 = new Line(point2, point3);
        Line line2 = new Line(point1, point2);


        System.out.println(line2);
        point1.setX(0);
        point1.setY(0);
        point2.setX(3);
        point2.setY(4);
        System.out.println(line2);
        System.out.println(line.getLine() + line1.getLine() + line2.getLine());
    }
}