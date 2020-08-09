package Mentoring5_ArrayList_Sorular.Kahoot;

import java.util.ArrayList;

public class soru6 {
    public static void main(String[] args) {


        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();

        a.add("Ömer");
        a.add("Hüseyin");
        a.add("Ahmet");
        a.add("Mehmet");

        b.add("Nurdan");
        b.add("Osman");
        b.add("ömer");
        b.add("Ahmet");

        a.removeAll(b);
        //a[Ömer , Hüseyin , Mehmet]
        //b[Nurdan, Osman, ömer, Ahmet]

        System.out.println(a);


    }
}
