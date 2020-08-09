package Mentoring5_ArrayList_Sorular.Kahoot;

import java.util.ArrayList;

public class soru5 {

    public static void main(String[] args) {

        ArrayList<String>arrayList = new ArrayList<>();

        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("e");
                                //x


        arrayList.add(5,"x");
        arrayList.set(3,"w");
        arrayList.remove("h");

        System.out.println(arrayList);
       System.out.println(arrayList.size());



    }
}
