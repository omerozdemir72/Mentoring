package Mentoring_7_Enum.KahveDukkani;

public enum Tatlilar {
CİLEKLİPASTA(4),
    MOZAİKPASTA(3.5),
    MUZLUPASTA(4.5);


private  final double tatliFiyati;
    Tatlilar(double tatliFiyati) {
        this.tatliFiyati=tatliFiyati;


    }

    public double getTatliFiyati(){

        return this.tatliFiyati;
    }
}
