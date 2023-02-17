/* package bai4;

import java.util.Scanner;

public class tinhtong2mang {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int[] arr1 = nhapmang(n);
        xuatmang(arr1);

        System.out.println("Nhập mảng b: ");
        int[] arr2 = nhapmang(n);
        xuatmang(arr2);
        
    }

    public static int[] nhapmang(int[] a, int[] b) {
        int [] a = new int[a];
        for (int i = 0; i < a.length; i++) {
            a[i] = nhapso("a[" + i + "] = ");
        }
        for (int i = 0; i < a.length; i++) {
            b[i] = nhapso("a[" + i + "] = ");
        return a;
        return new int[]{b};
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
} */
