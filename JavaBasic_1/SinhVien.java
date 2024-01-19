package JavaBasic_1;

import java.util.Scanner;

public class SinhVien {
    //Biến instance
    public double diemQT;
    //Biến static
    public static double diemThi;

    public double tinhDiemTB(){
        //Biến local
        double diemTB = 0;
        diemTB = diemQT*0.3 + diemThi*0.7;
        return diemTB;
    }

}
