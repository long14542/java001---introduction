package bai3.btvn;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        System.out.print("Nhập số thuận nghịch: ");
        int n = new Scanner(System.in).nextInt();
        if (n < 0) {
            System.out.println("Không phải là số thuận nghịch");
            return;
        }
        int original = n;
        int s = 0;
        for (; n != 0; n /= 10) {
            s = s * 10 + n % 10;
        }
        if (original == s) {
            System.out.println("Là số thuận nghịch");
        } else {
            System.out.println("Không phải là số thuận nghịch");
        }
    }
}
