package bai3;

import java.util.Scanner;

public class switchcl {
    public static void main(String[] args) {
        System.out.println("Nập giá trị của a: ");
        int a = new Scanner(System.in).nextInt();

        switch (a) {
            case 2:
                System.out.println("Mon");
                break;
            case 3:
                System.out.println("Tue");
                break;
            case 4:
                System.out.println("Wed");
                break;
            case 5:
                System.out.println("Thu");
                break;
            case 6:
                System.out.println("Fri");
                break;
            case 7:
                System.out.println("Sat");
                break;
            case 8:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Không hợp lệ");
                break;
        }
    }
}
