package bai4;

import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        int n = nhapso("Nhập số lượng phần tử của mảng: ");
        int[] arr = nhapmang(n);
        xuatmang(arr);
        /* int x = nhapso("nhập số x: ");
        int ketqua = timkiem(arr, x);
        if (ketqua == -1) {
            System.out.println("số " + x + "không xuất hiện trên mảng đã cho");
        } else {
            System.out.println("số " + x + "không xuất hiện trong mảng tại vị trí: " + ketqua);
        } */

    }
    public static int[] nhapmang(int n) {
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = nhapso("a[" + i + "] = ");
        }
        return a;
    }
    public static int nhapso(String thongdiep) {
        System.out.print("Nhập số: ");
        return new Scanner(System.in).nextInt();
    }
    public static void xuatmang(int[] a) {
        System.out.print("[");
        for (int i = 0; i< a.length; i++) {
            System.out.println(a[i]);
            if (i != a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
    public static void timkiem(int[] a, float x) {
        float kcbenhat = Math.abs(x - a[0]);
        int vitritimduoc = -1;
        int giatritimduoc = 0;
        for (int j : a) {
            float khoangcach = Math.abs(j - x);
            if (khoangcach == kcbenhat) {
                kcbenhat = khoangcach;
                vitritimduoc = 1;
                giatritimduoc = j;
            }
        }
        }

    }

    /* public static int timkiem(int[] a, int x) {
        int result = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                result = i;
                break;
            }
        }
        return result;
    */



