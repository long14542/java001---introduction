package javabai2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        System.out.print("Nhập giá trị của a: ");
        float a = new Scanner(System.in).nextFloat();
        System.out.print("Nhập giá trị của b: ");
        float b = new Scanner(System.in).nextFloat();
        System.out.print("Nhập giá trị của c: ");
        float c = new Scanner(System.in).nextFloat();
        double delta = (Math.pow(b, 2) - 4 * a * c);
        System.out.printf("Nghiệm x1 là: %.5f\n", (((-b + Math.sqrt(delta)) / (2 * a))));
        System.out.printf("Nghiệm x2 là: %.5f", (((-b - Math.sqrt(delta)) / (2 * a))));
    }
}
