package Mentoring_8_Try_Catch.kahoot;

public class soru2 {
    public static void main(String[] args) {


        try {
            int a = 30/0;
            System.out.println(a);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("HATA 1 " + e);
        }
        catch (ArithmeticException e){
            System.out.println("HATA 2  " + e);
        }catch (RuntimeException e){

            System.out.println("HATA 3 " +e);
        }


    }
}
