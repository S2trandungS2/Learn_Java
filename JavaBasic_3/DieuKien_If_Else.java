package JavaBasic_3;

public class DieuKien_If_Else {
    public int number = 100;
    public void kiemTra(int n){
        if(n==number){
            System.out.println("n bằng 100");
        }
        else if (n<number) {
            System.out.println("n nhỏ hơn 100");
        }
        else{
            System.out.println("n lớn hơn 100");
        }
    }
}
