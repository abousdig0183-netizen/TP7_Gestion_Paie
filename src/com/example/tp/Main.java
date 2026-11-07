
package com.example.tp;

public class Main {

    public static void main(String[] args) {

        Entreprise entreprise = new Entreprise();

        entreprise.ajouterEmploye(
                new EmployeHoraire("Amrani", "Sara", 18.0, 150));

        entreprise.ajouterEmploye(
                new EmployeSalarie("Bennani", "Omar", 3200.0));

        entreprise.ajouterEmploye(
                new Vendeur("Alaoui", "Meryem", 2800.0, 650.0));

        entreprise.ajouterEmploye(
                new EmployeHoraire("Fassi", "Yassine", 16.0, 130));

        entreprise.ajouterEmploye(
                new Vendeur("Idrissi", "Nadia", 3000.0, 400.0));

        entreprise.afficherPaie();
    }
}
