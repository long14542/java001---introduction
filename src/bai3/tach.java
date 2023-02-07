package bai3;
import java.util.Scanner;
public class tach {
    public static void main(String args[])
    {
        int s = 0;
        int n = new Scanner(System.in).nextInt();
        System.out.print("Nhập vào số cần tách:");
        while (n != 0) {
            s += n % 10;
            n = n / 10;
        }
        System.out.println(s);
    }
}
