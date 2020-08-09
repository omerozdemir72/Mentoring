package Mentoring_7_Enum;

/*
Enum renkler oluşturun. (main class i ile aynı classta olsun.)
Trafik lambası mantığı ile hareket edin. Her rengin parametresi olarak kuralını yazın. örn: KIRMIZI("DUR")   (KIRMIZI , SARI , YEŞİL için)

main methodunun içerisinde bu değerleri parametreleri ile beraber yazdırın. (       todo ipucu:  array a atayın     -    foreach)

Konsol böyle olmalı:

Renk : KIRMIZI    kural: DUR
Renk : SARI    kural: HAZIR OL
Renk : YESİL    kural: GEÇ
 */
public enum   renkler {

    KIRMIZI("DUR"), SARİ("HAZİR OL"), YESİL("GEC");


    private final String kural;
    renkler(String kural) {
        this.kural = kural;
    }

    public String getKural(){
        return this.kural;

    }

    public static void main(String[] args) {


            renkler [] tumRenkler = renkler.values();





   /*     for (renkler renkleriYazdir: tumRenkler) {

            System.out.println("Renk :  " + renkleriYazdir.name() + "  Kural :  " + renkleriYazdir.getKural());
        }*/


        for (int i = 0; i <tumRenkler.length ; i++) {

            System.out.println("Renkler : " + tumRenkler[i].name() + " kural :  " + tumRenkler[i].getKural());
        }





    }
    }



