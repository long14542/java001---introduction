package bai4;

import java.util.Scanner;

public class dequyfibbonacci {
    public static void main(String[] args) {
        System.out.println("Nhap so a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println(dequyfibbonaci(a));
    }
    public static int dequyfibbonaci(int a) {
        if (a == 1) {
            return 1;
        }
        return dequyfibbonaci(a - 2) + dequyfibbonaci(a - 1);
    }
}
