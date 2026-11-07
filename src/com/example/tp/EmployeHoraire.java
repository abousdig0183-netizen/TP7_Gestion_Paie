
package com.example.tp;

public class EmployeHoraire extends Employe {

    private double tauxHoraire;
    private double heuresTravaillees;

    public EmployeHoraire(String nom, String prenom,
                          double taux, double heures) {
        super(nom, prenom);
        this.tauxHoraire = taux;
        this.heuresTravaillees = heures;
    }

    @Override
    public double calculerSalaire() {
        double salaire = tauxHoraire * heuresTravaillees;
        return salaire;
    }
}
