package bai3;

import java.util.Scanner;

public class ss2soab {
    public static void main(String[] args) {
        System.out.print("Nhập giá trị của a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Nhập giá trị của b: ");
        int b = new Scanner(System.in).nextInt();
        System.out.print("Nhập giá trị của c: ");
        int c = new Scanner(System.in).nextInt();
        if (a >= b && a >= c) {
            System.out.println("a là số lớn nhất");
        }
        else if (b >= a && b >= c){
            System.out.println("b là số lớn nhất");
        }
        else {
            System.out.println("c là số lớn nhất");
        }

    }
}
