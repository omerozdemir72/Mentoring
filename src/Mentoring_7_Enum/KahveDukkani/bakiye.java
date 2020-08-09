package Mentoring_7_Enum.KahveDukkani;

public enum bakiye {

    Musteri1(10);


    private double bakiyem;

    bakiye(double bakiyem) {
        this.bakiyem=bakiyem;
    }

    public double getBakiyem(){

        return this.bakiyem;
    }
}
