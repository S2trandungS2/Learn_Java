package JavaBasic_5;

import java.util.ArrayList;
import java.util.List;

public class BT_Collection {
    NhanVien nv = null;
    List<NhanVien> dsNhanVien = new ArrayList<NhanVien>();
    public void themDSNhanVien(int n){
        for (int i = 0; i < n; i++){
            nv = new NhanVien();
            nv.nhap();
            dsNhanVien.add(nv);
        }

    }

    public void inDSNhanVien(){
        System.out.println("===Thông tin nhân viên===");
        for (int i = 0; i< dsNhanVien.size(); i++){
            dsNhanVien.get(i).xuat();
        }
    }

    public static void main(String[] args) {
        BT_Collection col = new BT_Collection();
        col.themDSNhanVien(2);
        col.inDSNhanVien();
    }




}
