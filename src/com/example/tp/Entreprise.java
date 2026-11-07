
package com.example.tp;

public class Entreprise {

    private Employe[] employes;
    private int nb;

    public Entreprise() {
        employes = new Employe[4];
        nb = 0;
    }

    public void ajouterEmploye(Employe e) {

        if (nb >= employes.length) {
            Employe[] nouveauTableau =
                    new Employe[employes.length * 2];

            for (int i = 0; i < nb; i++) {
                nouveauTableau[i] = employes[i];
            }

            employes = nouveauTableau;
        }

        employes[nb] = e;
        nb++;
    }

    public void afficherPaie() {

        System.out.println("=== Bulletin de paie ===");

        for (int i = 0; i < nb; i++) {
            System.out.println(employes[i]);
        }

        System.out.printf("Masse salariale totale : %.2f€%n",
                masseSalariale());
    }

    public double masseSalariale() {

        double somme = 0;

        for (int i = 0; i < nb; i++) {
            somme += employes[i].calculerSalaire();
        }

        return somme;
    }
}
