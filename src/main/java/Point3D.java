public class Point3D {
    private Point x;
    private int z;

    public Point3D(Point x, int z) {
        this.x = x;
        this.z = z;
    }
    public Point3D(int x1, int y1, int z) {
        this.x=new Point(x1, y1);
        this.z = z;
    }
    public double getPoint3D() {
        double x1 = x.getX();
        double y1 = x.getY();
        return x1;
    }
    public Point getX() {
        return x;
    }

    public void setX(Point x) {
        this.x = x;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return String.format("Точка 3D {%s,%s,%s}", getX().getX(), getX().getY(),z);
    }
}
