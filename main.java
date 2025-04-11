import model.*;
import service.ServiciuMagazin;

import java.util.Date;

public class main {
    public static void main(String[] args) {
        ServiciuMagazin serviciu = new ServiciuMagazin();

        Categorie electronice = new Categorie("Electronice");
        Categorie alimente = new Categorie("Alimente");

        Distribuitor d1 = new Distribuitor("TechSupplier", "Str. Electronica 1");
        Distribuitor d2 = new Distribuitor("FoodDistrib", "Str. Fructelor 22");

        Produs tv = new ProdusElectronic("Televizor LG", electronice, d1, 1500.0, 10, 24);
        Produs lapte = new ProdusPerisabil("Lapte Zuzu", alimente, d2, 6.5, 50, new Date());
        Produs laptop = new ProdusElectronic("Laptop HP", electronice, d1, 3200.0, 5, 12);

        serviciu.adaugaProdus(tv);
        serviciu.adaugaProdus(lapte);
        serviciu.adaugaProdus(laptop);

        System.out.println("--- Produse sortate dupa pret ---");
        serviciu.afiseazaProduseSortate();

        System.out.println("\\n--- Produse din categoria Electronice ---");
        serviciu.afiseazaProduseDupaCategorie(electronice);

        System.out.println("\\n--- Stocuri sub pragul 10 ---");
        serviciu.afiseazaStocuriCritice(10);

        System.out.println("\\n--- Produse de la distribuitorul TechSupplier ---");
        serviciu.afiseazaProduseDistribuitor("TechSupplier");
    }
}
