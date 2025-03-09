import java.awt.Point;

public class Start {
    public static void main(String[] args) {
        Point point = new Point(1,5);
        Point point1 = new Point(2,8);
        Point point2 = new Point(5,3);
        Point point3 = new Point(8,9);

        Line line = new Line(point.x,point.y,point1.x,point1.y);
        Line line1 = new Line(point1.x,point1.y,point2.x,point2.y);
        Line line2 = new Line(point2.x,point2.y,point3.x,point3.y);



        System.out.println(line2.toString());

        System.out.println(line.getLine()+ line1.getLine()+line2.getLine());




    }
}
