package Mentoring_7_Enum.KahveDukkani;

public enum icecekler {
TURKKAHVESİ(3),
    ESPRESSO(4.5),
    GAZOZ(2.25),
    LİMONATA(2);


private double fiyat;

    icecekler(double fiyat) {

        this.fiyat=fiyat;
    }

    public double getFiyat(){

        return this.fiyat;
    }


}
