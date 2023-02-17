package bai7.btvn.bai3;

import java.util.Scanner;

public class mainhcn {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the width of the rectangle: ");
            double width = scanner.nextDouble();

            System.out.print("Enter the height of the rectangle: ");
            double height = scanner.nextDouble();

            System.out.print("Enter the color of the rectangle: ");
            String color = scanner.next();

            Rectangle rectangle = new Rectangle(width, height, color);

            System.out.println("Width: " + rectangle.getWidth());
            System.out.println("Height: " + rectangle.getHeight());
            System.out.println("Color: " + rectangle.getColor());
            System.out.println("Area: " + rectangle.findArea());
            System.out.println("Perimeter: " + rectangle.findPerimeter());
        }
    }

