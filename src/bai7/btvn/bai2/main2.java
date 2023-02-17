package bai7.btvn.bai2;

import bai7.btvn.bai1.SinhVien;

import java.util.Arrays;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        System.out.println("NHập số lượng sinh viên: ");
        int n = new Scanner(System.in).nextInt();
        SinhVien[] sinhVi = new SinhVien[n];
        for (int i = 0; i < sinhVi.length; i++) {
            sinhVi[i] = new SinhVien();
            sinhVi[i].ThongTinSinhVien();
        }
        System.out.println(Arrays.toString(sinhVi));
    }
}
