package bai7.btvn.bai1;


import java.util.Random;
import java.util.Scanner;
public class SinhVien {
    int id;
    String ten;
    String lop;
    String khoa;

    public void ThongTinSinhVien() {
        this.id = new Random().nextInt();
        System.out.println("Nhập tên: ");
        this.ten = new Scanner(System.in).nextLine();
        System.out.println("Nhập lớp: ");
        this.lop = new Scanner(System.in).nextLine();
        System.out.println("Nhập khoa: ");
        this.khoa = new Scanner(System.in).nextLine();
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "id=" + id +
                ", ten='" + ten + '\'' +
                ", lop='" + lop + '\'' +
                ", khoa='" + khoa + '\'' +
                '}';
    }
}
