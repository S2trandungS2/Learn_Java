package JavaBasic_3;

public class Main {
    public static void main(String[] args) {
        DieuKien_If_Else dk = new DieuKien_If_Else();
        dk.kiemTra(101);

        //Toán tử
        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println((a < b) && (b < c)); //true
        System.out.println((a > b) || (b < c)); //true
        System.out.println(a == b); //false
        System.out.println(a !=b); //true
    }
}
