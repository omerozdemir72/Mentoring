package Mentoring_8_Try_Catch.kahoot;

public class soru1 {
    public static void main(String[] args) {



        try {

            int [] a = {1,2,3,4,5};
            a[7]=6;
        }catch (ArithmeticException e){

            System.out.println("Hata1 :  " + e);
        }catch ( ArrayIndexOutOfBoundsException e){
            System.out.println("Hata2 :  " + e);

        }









    }
}
