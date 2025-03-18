import java.util.ArrayList;

public class Start {
    public static void main(String[] args) {
        Point point = new Point(1,3);
        Point point1 = new Point(5,8);
        Point point2 = new Point(10,11);
        Point point3 = new Point(15,19); //Объявили точки
        Line line = new Line(point,point1);
        Line line1 = new Line(point1,point2);
        Line line2 = new Line(point2, point3); //Объявили линии


        ClosedPolyLine closedPolyLine = new ClosedPolyLine();
        closedPolyLine.addPolyLine(line);
        closedPolyLine.addPolyLine(line1);
        closedPolyLine.addPolyLine(line2);
        closedPolyLine.addPolyLine(new Line(point3,point));


        System.out.println(closedPolyLine.sumPolyLine());



    }
}