package JavaOOP_1;

public class NhanVien {
    public String ma;
    public String hoTen;
    public int tuoi;
    public String diaChi;


    public NhanVien(){

    }
    public NhanVien(String ma, String hoTen, int tuoi, String diaChi){
        this.ma = ma;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
    }
    public void inThongTin(){
        System.out.println("Mã: " + ma);
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Địa chỉ: " + diaChi);
  }


}
