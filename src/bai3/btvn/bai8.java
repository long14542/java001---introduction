package bai3.btvn;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        int n = input.nextInt();
        System.out.print("Nhập chiều rộng: ");
        int m = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
