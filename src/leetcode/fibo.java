package leetcode;

import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        int n = td("nhập số n: ");
        xuat(n);
        fibonacci(n);
    }
        public static int td(String thongdiep) {
            System.out.println(thongdiep);
            return new Scanner(System.in).nextInt();
        }
        public static void xuat(int n) {
            System.out.print("Fibonacci sequence up to " + n + ": ");
            for (int i = 1; i <= n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }
        public static int fibonacci(int n) {
            if (n <= 1) {
                return n;
            }
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

