
package com.example.tp;

public class Vendeur extends EmployeSalarie {

    private double commission;

    public Vendeur(String nom, String prenom,
                   double salaire, double commission) {
        super(nom, prenom, salaire);
        this.commission = commission;
    }

    @Override
    public double calculerSalaire() {
        return salaireMensuel + commission;
    }
}
