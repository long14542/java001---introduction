/* package bai7.mangdoituong;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Nhập vào số lượng sinh viên: ");
        int n = new Scanner(System.in).nextInt();
        SinhVien[] student = new SinhVien[n];

        for (int i = 0; i < student.length; i++) {
            student[i] = new SinhVien();
            System.out.println("-----------------");
            student[i].KhaiBaoThongTin();
        }
        System.out.println(Arrays.toString(student));

        System.out.println("--------------");
        int random = new Random().nextInt(n);
        student[random].name = "AAAAAAAAAAAAAA";
        System.out.println(Arrays.toString(student));
    }
} */
