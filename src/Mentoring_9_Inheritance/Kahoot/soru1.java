package Mentoring_9_Inheritance.Kahoot;

public class soru1 {

  public   static int  sayi= 30;
}

class soru1Sub extends soru1 {

    public soru1Sub() {
sayi+=25;

    }
    public static void main(String[] args) {
        soru1 soru1 = new soru1();

        soru1Sub sub = new soru1Sub();

        System.out.println(sayi + sayi);

    }
}
