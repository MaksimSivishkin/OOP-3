public class Line {
    Point x;
    Point y;

    public Line(){
        this.x=x;
        this.y=y;
    }

    public Line(int x1, int y1, int x2, int y2){
        this.x=new Point(x1, y1);
        this.y=new Point(x2, y2);
    }
    public double getLine(){
        int x1=x.getX();
        int y1=x.getY();
        int x2=y.getX();
        int y2=y.getY();
        return Math.sqrt((Math.pow(x2-x1, 2))+(Math.pow(y2-y1, 2)));
    }

    public String toString(){
        String res=String.format("Линия от %s до %s", x, y);
        return res;
    }
}
