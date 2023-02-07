package bai3.btvn;
import java.util.Scanner;
public class bai9 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Nhập độ cao: ");
            int h = input.nextInt();

            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }



