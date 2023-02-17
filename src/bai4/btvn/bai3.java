package bai4.btvn;

import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        int n = nhapso("nhap so phan tu cua mang: ");
        int[] arr = nhapmang(n);
        xuatmang(arr);
        sapxep(arr);
    }

    public static int[] nhapmang(int n) {
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = nhapso("a[" + i + "]");
        }
        return a;
    }

    public static int nhapso(String thongdiep) {
        System.out.println(thongdiep);
        return new Scanner(System.in).nextInt();
    }

    public static void xuatmang(int[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            if (i != a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public static void sapxep(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
