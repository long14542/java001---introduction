package javabai2;

import java.util.Scanner;

public class ptbac1haian {
    public static void main(String[] args) {
        System.out.print("Nhap so a: ");
        float a = new Scanner(System.in).nextFloat();
        System.out.println("Nhap so b: ");
        float b = new Scanner(System.in).nextFloat();
        System.out.printf("Nghiem cua pt %.3f * x + %.3f = 0 la %.3f", a, b, (-b / a));
    }
}
