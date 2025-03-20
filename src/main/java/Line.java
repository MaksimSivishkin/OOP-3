public class Line implements Measurable {
    protected Point x;
    protected Point y;

    public Line(Point x, Point y){
        this.x=x;
        this.y=y;
    }

    public Line(int x1, int y1, int x2, int y2){
        this.x=new Point(x1, y1);
        this.y=new Point(x2, y2);
    }
    @Override
    public double getLine(double x1, double y1, double x2, double y2) {
        x1=x.getX();
        y1=x.getY();
        x2=y.getX();
        y2=y.getY();
        return Math.sqrt((Math.pow(x2-x1, 2))+(Math.pow(y2-y1, 2)));
    }

    public Point getX() {
        return x;
    }

    public Point getY() {
        return y;
    }

    public void setX(Point x) {
        this.x = x;
    }

    public void setY(Point y) {
        this.y = y;
    }

    public String toString(){
        String res=String.format("%s, %s", x, y);
        return res;
    }
}
