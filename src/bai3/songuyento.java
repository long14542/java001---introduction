package bai3;

import java.util.Scanner;

public class songuyento {
    public static void main(String[] args) {
        System.out.print("Nhập giá trị của n: ");
        int n = new Scanner(System.in).nextInt();
        boolean laSNT = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0);
               laSNT = false;
        }
        if(laSNT) {
            System.out.println("SNT");
        } else {
            System.out.println("Ko phải là SNT");
        }
    }
}
