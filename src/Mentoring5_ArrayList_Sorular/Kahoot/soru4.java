package Mentoring5_ArrayList_Sorular.Kahoot;

import java.util.ArrayList;

public class soru4 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(50);
        arrayList.add(4);
        arrayList.add(22);
        arrayList.add(80);


         System.out.println(metod(arrayList));
    }
    public static int metod(ArrayList<Integer> arrayList){
        int sum = 0;
        for (int i = 0; i <arrayList.size() ; i++) {
                    sum+=arrayList.get(i);

        }

return sum;
 }
}
