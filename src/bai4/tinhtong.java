package bai4;

import java.util.Scanner;

public class tinhtong {
    public boolean ktsnt(int n) {
        System.out.println("nhap snt: ");
        n = new Scanner(System.in).nextInt();
        if (n < 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
