package JavaBasic_2;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println("Tổng 2 số: "+ cal.tinhTong(5,10));
        System.out.println("Tích 2 số: "+ cal.tinhTich(2.25, 10.5));
    }
}
