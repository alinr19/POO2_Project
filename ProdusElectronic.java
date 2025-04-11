package model;

public class ProdusElectronic extends Produs {
    private int garantieLuni;

    public ProdusElectronic(String denumire, Categorie categorie, Distribuitor distribuitor, double pret, int stoc, int garantieLuni) {
        super(denumire, categorie, distribuitor, pret, stoc);
        this.garantieLuni = garantieLuni;
    }

    @Override
    public String toString() {
        return super.toString() + " | Garantie: " + garantieLuni + " luni";
    }
}
