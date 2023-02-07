package bai3.btvn;

import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        System.out.print("Nhập độ cao tam giác cân: ");
        int h = new Scanner(System.in).nextInt();
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h - i; j++) {
                System.out.print("  ");
            }for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
