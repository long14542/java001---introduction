package bai4;

import java.util.Scanner;

public class nhappmang {
    static String thongdiep;

    public static void main(String[] args) {
        int n = nhapso("Nhập số lượng phần tử của mảng: ");
        int[] arr = nhapmang(n);
        xuatmang(arr);
        timkiem(arr);
    }

    public static int[] nhapmang(int n) {
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = nhapso("a[" + i + "] = ");
        }
        return a;
    }
    public static int nhapso(String thongdiep) {
        System.out.print(thongdiep);
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
    public static void timkiem(int[] a) {
        int solonnhat = a[0];
        int vitri = 0;
        for (int i = 1; i < a.length; i++) {
            if (solonnhat < a[i]) {
                solonnhat = a[i];
                vitri = i;
            }
        }
        System.out.println(solonnhat);
        System.out.println(vitri);
    }

}
