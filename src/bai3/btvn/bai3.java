package bai3.btvn;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        System.out.println("Nhập giá trị của a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Nhập giá trị của b: ");
        int b = new Scanner(System.in).nextInt();
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                if (i == Math.min(a, b)) {
                    System.out.printf("Ước chung lớn nhất của %d và %d là: %d\n", a, b, i);
                }
            }
        }

        int lcm = Math.max(a, b);
        while(true) {
            if( lcm % a == 0 && lcm % b == 0 ) {
                System.out.printf("Bội chung nhỏ nhất của %d và %d là %d", a, b, lcm);
                break;
            }
            ++lcm;
        }
    }
}
