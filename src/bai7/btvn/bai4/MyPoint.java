package bai7.btvn.bai4;

public class MyPoint {
    double x, y;

    public MyPoint() {
        x = 0.0;
        y = 0.0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint(MyPoint p) {
        x = p.getX();
        y = p.getY();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint secondPoint) {
        double xDiff = x - secondPoint.getX();
        double yDiff = y - secondPoint.getY();
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public static double distance(MyPoint p1, MyPoint p2) {
        return p1.distance(p2);
    }
}

