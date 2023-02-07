package bai3;

import java.util.Scanner;

import java.util.Scanner;

public class bai14 {
    public static void main(String[] args) {
        System.out.print("Nhap so n: ");
        int n = new Scanner(System.in).nextInt();

        System.out.print("Cac so chan nho hon n la: ");
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.print("Cac so le nho hon n la: ");
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
