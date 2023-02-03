package javabai2;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        System.out.print("Nhập chiều dài hcn: ");
        float a = new Scanner(System.in).nextInt();
        System.out.print("Nhập chiều rộng hcn: ");
        float b = new Scanner(System.in).nextInt();
        System.out.printf("Chu vi hcn là: %.0f\n", ((a + b) * 2));
        System.out.printf("Diện tích hcn là: %.0f", (a * b));
    }
}
