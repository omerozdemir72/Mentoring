package Mentoring_8_Try_Catch;

public class islem {
    /*
    randomSayi isminde static void bir method oluşturun.

    Bu method içerisinde iki int random sayı oluştusun. (0'dan 10 a kadar)

    Bu iki random sayının toplamını yazdırın.
    Eğer bu iki random sayının toplamı 12 den küçükse "Exception" versin ve mesaj olarak ("Sayı 12'den küçük ise hata verir") yazsın.

    Methodu main methodunda çağırın ve kodun düzgün çalışmasını sağlayın. (Aksaklığı giderin)
     */
    static void randomSayi ()
    {

        int random1 = (int)(Math.random()* 10+1);
        int random2 = (int)(Math.random()* 10+1);

        System.out.println(random1 + random2);

        if (random1 + random2 < 12){

            throw new ArithmeticException("Sayı 12'den küçük ise hata verir...");
        }

    }


    public static void main(String[] args)  {


    randomSayi();


}






    }







