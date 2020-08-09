package Mentoring_8_Try_Catch.kahoot;

public class soru8 {
    public static void main(String[] args) {

        try {
            int a [] = new int[4];
          a[1]= 5;
          a[2]= 4;
            System.out.println(a[1] + a[3]);
        }catch (Exception a){
            System.out.println(a);
        }finally {
            System.out.println("Sistem kapanıyor.");
        }
    }
}
