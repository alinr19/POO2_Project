package service;

import model.*;

import java.util.*;

public class ServiciuMagazin {
    private Map<Categorie, List<Produs>> produsePeCategorii = new HashMap<>();
    private TreeSet<Produs> produseSortate = new TreeSet<>();

    public void adaugaProdus(Produs produs) {
        produsePeCategorii.putIfAbsent(produs.getCategorie(), new ArrayList<>());
        produsePeCategorii.get(produs.getCategorie()).add(produs);
        produseSortate.add(produs);
    }

    public void stergeProdus(Produs produs) {
        List<Produs> lista = produsePeCategorii.get(produs.getCategorie());
        if (lista != null) {
            lista.remove(produs);
        }
        produseSortate.remove(produs);
    }

    public void modificaStoc(String denumire, int nouStoc) {
        for (Produs produs : produseSortate) {
            if (produs.getDenumire().equals(denumire)) {
                produs.setStoc(nouStoc);
                break;
            }
        }
    }

    public void afiseazaProduseDupaCategorie(Categorie categorie) {
        List<Produs> lista = produsePeCategorii.get(categorie);
        if (lista != null) {
            lista.forEach(System.out::println);
        } else {
            System.out.println("Nu exista produse in aceasta categorie.");
        }
    }

    public void afiseazaProduseSortate() {
        produseSortate.forEach(System.out::println);
    }

    public void afiseazaStocuriCritice(int prag) {
        produseSortate.stream().filter(p -> p.getStoc() < prag).forEach(System.out::println);
    }

    public void afiseazaProduseDistribuitor(String numeDistribuitor) {
        produseSortate.stream()
                .filter(p -> p.getDistribuitor().getNume().equalsIgnoreCase(numeDistribuitor))
                .forEach(System.out::println);
    }
}
