package bai4;

import java.util.Arrays;
import java.util.Scanner;

public class bubblesort {
    private static String thongdiep;

    public static void main(String[] args) {
        int n = nhapso("Nhập số lượng phần tử của mảng: ");
        int[] arr = nhapmang(n);
        xuatmang(arr);
        sapxep(arr);
    }

    public static int[] nhapmang(int n) {
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = nhapso("a[" + i + "] = ");
        }
        return a;
    }
    public static int nhapso(String thongdiep) {
        nhappmang.thongdiep = thongdiep;
        System.out.print("Nhập số: ");
        return new Scanner(System.in).nextInt();
    }
    public static void xuatmang(int[] a) {
        System.out.print("[");
        for (int i = 0; i< a.length; i++) {
            System.out.print(a[i]);
            if (i != a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public static void sapxep(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
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
