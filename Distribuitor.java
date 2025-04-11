package model;

public class Distribuitor {
    private String nume;
    private String adresa;

    public Distribuitor(String nume, String adresa) {
        this.nume = nume;
        this.adresa = adresa;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public String toString() {
        return nume + ", " + adresa;
    }
}
