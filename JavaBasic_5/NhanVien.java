package JavaBasic_5;

import java.util.Scanner;

public class NhanVien {
    public String hoTen;
    public int tuoi;
    public String diaChi;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Họ và Tên: ");
        hoTen = sc.nextLine();
        System.out.print("Tuổi: ");
        tuoi = sc.nextInt();
        sc.nextLine();
        System.out.print("Địa chỉ: ");
        diaChi = sc.nextLine();
    }

    public void xuat(){
        System.out.println(hoTen + "\t" + tuoi + "\t" + diaChi);
    }
}
