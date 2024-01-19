package JavaBasic_5;

import java.util.ArrayList;
import java.util.List;

public class BT_ArrayList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i <= 50; i = i+2){
            arrayList.add(i);
        }

        System.out.println("Các số chẵn từ 0 đên 50: ");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + "\t");
        }

    }
}
