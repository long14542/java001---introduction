 /* package bai7.mangdoituong;

 import java.util.Scanner;

 public class SinhVien {
    int id;
    String name;
    String gender;
    String hometown;
    String khoa;
    int dtb;

    static int AUTO_ID = 1000;

    public void KhaiBaoThongTin() {
        this.id = AUTO_ID;
        AUTO_ID++;
        System.out.println("Nhập tên: ");
        this.name = new Scanner(System.in).nextLine();

        System.out.println("Nhập quê quán: ");
        this.hometown = new Scanner(System.in).nextLine();

        System.out.println("Nhập giới tính: ");
        this.gender = new Scanner(System.in).nextLine();

        System.out.println("Nhập tên khoa: ");
        this.khoa = new Scanner(System.in).nextLine();

        System.out.println("Nhập điểm tb: ");
        this.dtb = new Scanner(System.in).nextInt();
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", hometown='" + hometown + '\'' +
                ", khoa='" + khoa + '\'' +
                ", dtb=" + dtb +
                '}';
    }


 } */
