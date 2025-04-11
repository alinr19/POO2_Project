package model;

public class Produs implements Comparable<Produs> {
    protected String denumire;
    protected Categorie categorie;
    protected Distribuitor distribuitor;
    protected double pret;
    protected int stoc;

    public Produs(String denumire, Categorie categorie, Distribuitor distribuitor, double pret, int stoc) {
        this.denumire = denumire;
        this.categorie = categorie;
        this.distribuitor = distribuitor;
        this.pret = pret;
        this.stoc = stoc;
    }

    public String getDenumire() {
        return denumire;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public Distribuitor getDistribuitor() {
        return distribuitor;
    }

    public double getPret() {
        return pret;
    }

    public int getStoc() {
        return stoc;
    }

    public void setStoc(int stoc) {
        this.stoc = stoc;
    }

    @Override
    public int compareTo(Produs p) {
        return Double.compare(this.pret, p.pret);
    }

    @Override
    public String toString() {
        return denumire + " | " + categorie + " | " + pret + " RON | stoc: " + stoc;
    }
}
