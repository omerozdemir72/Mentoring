package Mentoring_8_Try_Catch.kahoot;

public class soru7 {

    public static void main(String[] args) {
        try {
            int a = 30/0;
            System.out.println(a+5);
        }catch (ArithmeticException e){
            System.out.println("HATA 1  " + e);
        }catch (IndexOutOfBoundsException e){

            System.out.println("Hata 2"+ e);
        }catch (Exception e){

            System.out.println("Hata 3" + e);
        }

    }
    }
