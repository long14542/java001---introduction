package bai3.btvn;

import java.util.Scanner;

public class bai12 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Nhập vào số nguyên m: ");
            int m = scan.nextInt();
            System.out.print("Nhập vào số nguyên n: ");
            int n = scan.nextInt();
            int count = 0;
            for (int i = m; i <= n; i++) {
                int sqrt = (int) Math.sqrt(i);
                if (sqrt * sqrt == i) {
                    count++;
                    System.out.println(i + " là số chính phương");
                }
            }
            System.out.println("Có " + count + " số chính phương trong đoạn [" + m + ", " + n + "]");
        }
    }


