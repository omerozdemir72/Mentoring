package Mentoring_9_Inheritance.sirket;

public class mainClass {
    public static void main(String[] args) {
/*
calisan isminde bir class oluşturun.
private String isim
private String departman
private String maas;

public int zam isminde method oluşturun.

500 tl zam yapsın.
return olarak maaşı döndürün

void bilgilerim diye bir method oluşturun ve bilgileri yazdırın.

yönetici classı olusturun.  calisan classındaki bilgilere sahip olsun ve ekstra int sorumluOlduguKisiSayisi oluşturun.

Bilgilerini yazdırmak için method oluşturun.

      (  Hakan'ın maaşının zamlı hali 2000 olsun. )

main classta cağırın ve konsol böyle bir görüntü olsun :
Bilgiler Yükleniyor....
isim = Hakan
departman = Bilişim
maas = 2000
----------------------------------------
Bilgiler Yükleniyor....
isim = Hatice
departman = Satış
maas = 1700
----------------------------------------
Bilgiler Yükleniyor....
isim = Ömer
departman = Yönetici
maas = 3500
Sorumlu olduğu kişi sayısı : 100

*/


        calisan sekreter = new calisan("Hakan","Bilişim",2000);

        sekreter.zam();
        sekreter.Bilgilerim();


        System.out.println(" ----------------------------------");


        calisan satisDanismani = new calisan("Hatice","Pazarlama",1700);

        satisDanismani.Bilgilerim();

        System.out.println("---------------------");

        yonetici mudur = new yonetici("Ömer","Yönetim",3500,100);

        mudur.zam();
        mudur.Bilgilerim();

    }
}
