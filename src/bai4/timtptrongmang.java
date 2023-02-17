package bai4;

import java.util.Scanner;

public class timtptrongmang {
    public static void main(String[] args) {
        int n = nhapso("Nhap n: ");
        int[] arr = nhapmang(n);
        xuatmang(arr);
        int x = nhapso("Nhap x: ");
        int ketqua = timkiem(arr, x);
        if (ketqua == -1) {
            System.out.println("ko ton tai phan tu: ");
        } else {
            System.out.println("co ton tai");
        }

    }

    public static int[] nhapmang(int n) {
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = nhapso("a[" + i + "]");
        }
        return a;
    }
    public static int nhapso(String thongdiep) {
        System.out.print(thongdiep);
        return new Scanner(System.in).nextInt();
    }

    public static void xuatmang(int[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(" ,");
            }
        }
        System.out.print("]");
    }
    public static int timkiem(int[] a, int x) {
        int result = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                result = i;
                break;
            }
        }
        return result;
    }
}
