package bai3.btvn;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        int n = input.nextInt();
        System.out.print("Nhập chiều rộng: ");
        int m = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
