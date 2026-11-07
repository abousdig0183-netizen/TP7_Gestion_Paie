
package com.example.tp;

public class EmployeSalarie extends Employe {

    protected double salaireMensuel;

    public EmployeSalarie(String nom, String prenom, double salaire) {
        super(nom, prenom);
        this.salaireMensuel = salaire;
    }

    @Override
    public double calculerSalaire() {
        double remuneration = salaireMensuel;
        return remuneration;
    }
}
