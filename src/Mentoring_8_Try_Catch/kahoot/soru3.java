package Mentoring_8_Try_Catch.kahoot;

public class soru3 {
    public static void main(String[] args) {
        try {

    String a = "Techno Study";
    String yeniString = a.substring(11);
          //  System.out.println(yeniString);
    System.out.println(yeniString.indexOf(2));
}catch (ArithmeticException a){

    System.out.println("Hata 1 :  " + a);
}catch (IllegalArgumentException e){

    System.out.println("Hata 2: " + e);
}

    }
}
