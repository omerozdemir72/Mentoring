package Mentoring5_ArrayList_Sorular.Kahoot;

import java.util.ArrayList;

public class soru3 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();


        ElemanEkle(arrayList);

        arrayList.add("muz");

        System.out.println(arrayList);


    }
    public static void ElemanEkle(ArrayList<String> arrayList){

        arrayList.add("elma");
        arrayList.add("armut");
        arrayList.add("üzüm");

        System.out.println(arrayList);
    }


}


