package Mentoring5_ArrayList_Sorular;

import java.util.ArrayList;
import java.util.Collections;

public class odevCozumu {
    public static void main(String[] args) {

          /*
İki adet Integer ArrayList  ( a ve b)    oluşturun.   İkisi de 6 elemandan oluşmalı. (int arraylist a   ve     int arraylist   b )


RandomEkleVeOrtakElemaniBul isminde bir void method oluşturun.

Bu method, oluşturduğumuz iki int array ' e 0'dan 50 ye kadar random değer atasın.
Değerler atandıktan sonra bu iki int array  küçükten büyüğe sıralansın.

Devamında, bu iki array arasında ortak eleman olup olmadığı check edilsin.
Eğer ortak eleman varsa, bu ortak elemanları "Arraylist ortak" isminde başka bir arrayliste gönderin.
Ve "sadece ortak eleman varsa" bu arraylisti yazdırın.
Eğer yoksa "Ortak eleman yoktur" mesajı gelsin.



OrtakElemanlariKaldir   adında void bir method oluşturun.
Bu method ise,  eğer a ve b arasında ortak elemanlar varsa  a'dan b'deki elemanları çıkartsın.(Ortak elemanları cıkartsın)
ve a 'nın yeni halini (b 'den arınmış halini) konsola yazınız.
Eğer ortak elemanları yoksa hiçbir şey yazmasın.

Ve bu iki methodu main methodunda çağırın.


Konsol örneklerini dikkatlice inceleyin..

        todo Konsol şöyle olmalı     (Eğer ortak eleman varsa):
a  ilk hali :     [8, 24, 33, 35, 36, 43]
b ilk hali  :    [4, 14, 17, 36, 43, 44]

Ortak elemanlı yeni array: [36, 43]

Ortak olanları çıkardıktan sonra Arraylist a :  [8, 24, 33, 35]


todo Konsol şöyle olmalı (Eğer ortak elemanları yoksa);

a  ilk hali :     [17, 30, 30, 39, 46, 47]
b ilk hali  :    [11, 25, 25, 26, 28, 44]
Ortak eleman yoktur ...



 */

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();


        RandomEkleVeOrtakElemanBul(a,b);
        System.out.println();
        OrtakElemanlariKaldir(a,b);

    }

    public static void RandomEkleVeOrtakElemanBul(ArrayList<Integer> r,ArrayList<Integer> r2){
        //          Arraylist r için eleman atıyoruz
        for (int i = 0; i <6 ; i++) {
            r.add((int)(Math.random()*50+1));
        }

        Collections.sort(r);
        System.out.println("a ilk hali :  " + r);



        //      Arralist r2 ye eleman atanıyor..

        for (int i = 0; i <6 ; i++) {
            r2.add((int)(Math.random()*50+1));
        }

        Collections.sort(r2);
        System.out.println("b ilk hali :  " + r2);


                // ortak elemanları atamak için yeni bir arraylist
        ArrayList<Integer>ortak =new ArrayList<>();

        int count = 0;

        for (int i = 0; i <r.size(); i++) {
            for (int j = 0; j <r2.size() ; j++) {

                if (r.get(i).equals(r2.get(j))){
                    count ++;
                    ortak.add(r.get(i));
                }
            }
        }if (count==0){
            System.out.println("Ortak eleman yoktur...");
        }

        if (count>0){
            System.out.println("Ortak elemanlı yeni array :  " + ortak);
        }


    }

    public static void OrtakElemanlariKaldir(ArrayList<Integer>r,ArrayList<Integer>r2){

        int count = 0;

        for (int i = 0; i <r.size(); i++) {
            for (int j = 0; j < r2.size(); j++) {
                if (r.get(i).equals(r2.get(j))) {
                    count++;
                }
            }
        }
            if (count>0){
                r.removeAll(r2);
                System.out.println("Ortak olanları çıkardıktan sonra Arraylist a =  " + r);
            }
        }

    }





