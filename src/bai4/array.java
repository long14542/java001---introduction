package bai4;

import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        System.out.println("Nhap so phan tu cua mang: ");
        int n = new Scanner(System.in).nextInt();

        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Nhap gia tri cho phan tu thu " + (i + 1));
            a[i] = new Scanner(System.in).nextInt();
        }
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            s += i;
        }

        System.out.println(Arrays.toString(a));
    }
}
