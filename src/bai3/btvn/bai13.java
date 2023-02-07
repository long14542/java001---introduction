package bai3.btvn;

import java.util.Scanner;

public class bai13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so n: ");
        int n = input.nextInt();
        int s = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 7 == 0) {
                s += i;
            }
        }

        System.out.println("Tong cac so chia het cho 7 la: " + s);
    }
}

