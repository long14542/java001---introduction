package bai7.btvn.bai4;

import java.util.Scanner;

public class mainmp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of points: ");
        int n = scanner.nextInt();

        MyPoint[] points = new MyPoint[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the x-coordinate of point " + (i+1) + ": ");
            double x = scanner.nextDouble();

            System.out.print("Enter the y-coordinate of point " + (i+1) + ": ");
            double y = scanner.nextDouble();

            points[i] = new MyPoint(x, y);
        }

        double maxDistance = 0.0;
        int point1 = 0, point2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                double distance = MyPoint.distance(points[i], points[j]);
                if (distance > maxDistance) {
                    maxDistance = distance;
                    point1 = i;
                    point2 = j;
                }
            }
        }

        System.out.println("The two points with the maximum distance are:");
        System.out.println("Point " + (point1+1) + " (" + points[point1].getX() + ", " + points[point1].getY() + ")");
        System.out.println("Point " + (point2+1) + " (" + points[point2].getX() + ", " + points[point2].getY() + ")");
        System.out.println("The distance between them is: " + maxDistance);
    }
}
