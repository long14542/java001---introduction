package bai3;

import java.util.Scanner;

public class demotong {
    public static void main(String[] args) {
        System.out.println("Nhập số n: ");
        int n = new Scanner(System.in).nextInt();
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s += i;
        }
        System.out.println("Tổng từ 1 đến " + n + " là " + s);
    }
}
