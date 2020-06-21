package Ömer.ab_ArrayMethodlari_2DArray_Mentoring3;

import java.util.Arrays;

public class Array_Methodlari {

    public static void main(String[] args) {


                          //todo                                                                            -           -           -        Arrays.toString() methodu -    -   -   -   -   -   -   -   -


        System.out.println("    \n ---  1. Arrays.toString()    Methodu    ----  \n"      );

//Dizimizi konsola "Dizi şeklinde"  yazdırmamıza yarar..

        int [] a = {1,2,3,4,5};
        System.out.println(Arrays.toString(a));










        System.out.println("    \n ---  2. Arrays.fill()    Methodu    ----  \n"      );
                                   //todo                                                                      --     --                               Arrays.fill() method ---    ----            ---



//Array'deki tüm elemanlar, belirtilen eleman ile doldurulur..

        int [] liste = {1,4,7,8,9,10};

        System.out.println("Array'in ilk hali: " + Arrays.toString(liste));
//        Arrays.fill(liste,4);
//        System.out.println("Array'in sonraki hali:  " + Arrays.toString(liste));




        //Değiştirilecek değerin,  hangi aralıkta olduğunu belirleyebiliriz.

        Arrays.fill(liste,0,4,99);

        System.out.println("Sonraki hali :  " + Arrays.toString(liste));












        System.out.println("    \n ---  3. Arrays.sort()    Methodu    ----  \n"      );
        //todo       -- -   -       -   -   -   -   -   -   -   -   -   -                   Arrays.sort()   Methodu --          --              -           -           -   -   -   -   -   -

//Array'in elemanlarını küçükten büyüğe sıralamamızı sağlar..

        int [] b ={88,77,25,66,31,22,3};

//        Arrays.sort(b);
//        System.out.println(Arrays.toString(b));


        //belirli bir aralığı küçükten büyüğe sıralamamızı sağlar..

        System.out.println(Arrays.toString(b));
        Arrays.sort(b,0,4);
        System.out.println(Arrays.toString(b));



        String [] dizi = {"x","q","u","a","c","b","z"};

        System.out.println("ilk hali:  " + Arrays.toString(dizi));
        Arrays.sort(dizi);

        System.out.println("Alfabetik : " + Arrays.toString(dizi));













        System.out.println("    \n ---  4. Arrays.equals()    Methodu    ----  \n"      );
        //todo       -- -   -       -   -   -   -   -   -   -   -   -   -                   Arrays.equals()   Methodu --          --              -           -           -   -   -   -   -   -

String [] x = {"Techo" , "Study", "Avrupa"};
String [] y = {"Study", "Avrupa"  ,"Techno"};
String [] z = {"Techo" , "Study", "Avrupa"};


        System.out.println(Arrays.equals(x,y));
        System.out.println(Arrays.equals(x,z));


if (Arrays.equals(x,z)){
    System.out.println("Eşittir.");
}else
    System.out.println("Eşit değildir.");








        System.out.println("    \n ---  5. Arrays.binarySearch()    Methodu    ----  \n"      );
        //todo       -- -   -       -   -   -   -   -   -   -   -   -   -                   Arrays.binarySearch()   Methodu --          --              -           -           -   -   -   -   -   -
//Bu method, sadece Sıralı dizilerde çalışır. Eğer dizinizin elemanları sıralı değilse, önce sort methodu ile sıraya koyun, daha sonra binarySearch methodunu kullanın.

        int [] d = {22,1,37,4,5,3,7};
        int degisken = Arrays.binarySearch(d,3);
        System.out.println("Sıralamadan önce:  " + degisken);
        Arrays.sort(d);
        degisken = Arrays.binarySearch(d,3);

        System.out.println(Arrays.toString(d));

        System.out.println("Sıralamadan sonra:  " + degisken);



    }
}
