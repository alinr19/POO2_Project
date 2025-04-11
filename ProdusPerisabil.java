package model;

import java.util.Date;

public class ProdusPerisabil extends Produs {
    private Date dataExpirare;

    public ProdusPerisabil(String denumire, Categorie categorie, Distribuitor distribuitor, double pret, int stoc, Date dataExpirare) {
        super(denumire, categorie, distribuitor, pret, stoc);
        this.dataExpirare = dataExpirare;
    }

    @Override
    public String toString() {
        return super.toString() + " | Expira la: " + dataExpirare;
    }
}
