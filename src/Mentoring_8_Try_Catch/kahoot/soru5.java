package Mentoring_8_Try_Catch.kahoot;

import java.util.ArrayList;

public class soru5 {
    public static void main(String[] args) {

        try {
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(3);
            arrayList.add(4);
            arrayList.add(5);
            arrayList.add(6);
            for (int i =1; i<=5;i++){
                System.out.println(arrayList.get(i));
            }
        }
        catch (Exception e) {
            System.out.println("Hata : " + e);

        }

    }
}
