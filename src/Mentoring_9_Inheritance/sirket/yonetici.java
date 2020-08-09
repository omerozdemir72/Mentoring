package Mentoring_9_Inheritance.sirket;

public class yonetici extends calisan {
    private int sorumluOlduguKisiSayisi;
    public yonetici(String isim, String departman, int maas, int sorumluOlduguKisiSayisi) {
        super(isim, departman, maas);
        this.sorumluOlduguKisiSayisi = sorumluOlduguKisiSayisi;
    }
    @Override
    public void Bilgilerim() {
        super.Bilgilerim();
        System.out.println("Sorumlu olduğu kişi sayısı: " + this.sorumluOlduguKisiSayisi);
    }
}

