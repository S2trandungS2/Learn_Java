package JavaBasic_4;

public class For_Array {
    public static void main(String[] args) {
        int[] mang = new int[26];
        int index = 0;
        for(int i = 0; i <= 50; i++){
            if(i%2==0){
                mang[index] = i;
                index++;
            }
        }

        System.out.println("Các số chẵn từ 0 đến 50:");
        for (int i = 0; i < mang.length; i++) {
            System.out.print(mang[i] + " ");
        }



    }
}
