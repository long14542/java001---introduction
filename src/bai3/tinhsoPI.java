package bai3;

import java.util.Scanner;

public class tinhsoPI {
    public static void main(String[] args) {
        System.out.print("Nhập giá trị của c: ");
        long c = new Scanner(System.in).nextLong();
        double PI = 0;
        for (int i = 1; c < (double)(1 / (2 * i + 1)); i++) {
            PI = Math.pow(-1, i) / (2 * i + 1);
        }
        PI *= 4;
        System.out.println(PI);
    }
}
