package JavaBasic_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();

        //Nhập thông tin sinh viên
        Scanner sc = new Scanner(System.in);
        System.out.print("Họ và Tên: ");
        ThongTin.hoTen = sc.nextLine();
        System.out.print("Tuổi: ");
        ThongTin.tuoi = sc.nextInt();
        System.out.print("Điểm quá trình: ");
        sv.diemQT = sc.nextDouble();
        System.out.print("Điểm thi: ");
        SinhVien.diemThi = sc.nextDouble();

        //In thông tin sinh viên
        System.out.println("Họ và Tên: " + ThongTin.hoTen);
        System.out.println("Tuổi: " + ThongTin.tuoi);
        System.out.println("Điểm quá trình: " + sv.diemQT);
        System.out.println("Điểm thi: " + SinhVien.diemThi);
        System.out.println("Điểm trung bình: " + sv.tinhDiemTB());

    }
}