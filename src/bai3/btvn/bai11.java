package bai3.btvn;

import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        System.out.println("Nhập số tự nhiên n: ");
        int n = new Scanner(System.in).nextInt();
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s += i;
        }
        System.out.printf("Tổng các số không lớn hơn %d là %d \n", n, s);
        int s1 = 0;
        int s2 = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                s2 += i;
            } else {
                s1 += i;
            }
        }
        System.out.printf("Tổng các số chẵn không lớn hơn %d là %d \n", n, s2);
        System.out.printf("Tổng các số lẻ không lớn hơn %d là %d \n", n, s1);
    }

}
