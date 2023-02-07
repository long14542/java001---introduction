package bai3.btvn;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        System.out.print("Nhập số nguyên: ");
        int n = new Scanner(System.in).nextInt();
        int s = 0;
        for (; n != 0; n /= 10) {
            s = s + n % 10;
        }
        System.out.println(s);
    }
}
