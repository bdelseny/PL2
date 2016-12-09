package compte;

/**
 * Un compte bancaire
 *
 * numeroCourant, le numéro de compte à incrémenter pour le nouveau numéro de
 * compte; titulaire une personne titulaire d'un compte decouvertMax le
 * découvert maximum autorisé pour le compte debitMax le débit maximum autorisé
 * pour le compte solde le solde courant
 *
 * @author delsenyb
 */
public class Compte {

    private static final int DEFAULT_DECOUVERT = 800;
    private static final int DEFAULT_DEBIT = 1000;

    private static int numeroCourant = 0;

    private Titulaire titulaire;
    private final int numeroCompte;
    private double decouvertMax;
    private double debitMax;
    private double solde;

    /**
     * Création compte, valeurs par defaut
     *
     * @param t titulaire du compte
     */
    public Compte(Titulaire t) {
        this(t, DEFAULT_DECOUVERT, DEFAULT_DEBIT, 0);
    }

    /**
     * Création compte
     *
     * @param t titulaire du compte
     * @param d découvert maximum autorisé
     * @param debit débit maximum autorisé
     * @param s solde du compte
     */
    public Compte(Titulaire t, double d, double debit, double s) {
        titulaire = t;
        decouvertMax = d;
        debitMax = debit;
        solde = s;
        Compte.numeroCourant++;
        numeroCompte = Compte.numeroCourant;
    }

    public Titulaire getTitulaire() {
        return titulaire;
    }

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public double getDecouvertMax() {
        return decouvertMax;
    }

    public double getDebitMax() {
        return debitMax;
    }

    public double getSolde() {
        return solde;
    }

    public void setDecouvertMax(double decouvertMax) {
        this.decouvertMax = decouvertMax;
    }

    public void setDebitMax(double debitMax) {
        this.debitMax = debitMax;
    }
    
    /**
     * Changer l'adresse du titulaire
     * @param a  l'adresse
     */
    public void changerAdresse(String a){
        this.titulaire.setAdresse(a);
    }
    
    /**
     * Calcul du découvert du compte
     *
     * @return decouvert
     */
    double getDecouvert() {
        if (solde < 0) {
            return Math.abs(solde);
        }
        return 0;
    }

    /**
     * Calcul le débit autorisé en fonction du solde actuel du compte et du
     * débit maximum autorisé
     *
     * @return débit autorisé
     */
    public double debitAutorise() {
        double retraitPossible;
        retraitPossible = decouvertMax - getDecouvert();

        if (debitMax < retraitPossible) {
            return debitMax;
        }
        return retraitPossible;
    }

    /**
     * Débite le compte du montant désiré. Si le débit n'est pas autorisé, la
     * fonction renvoie une exception précisant la nature du problème (débit
     * négatif, débit autorisé inférieur au montant)
     *
     * @param montant du débit
     */
    public void debiter(double montant) {
        if (montant < 0) {
            throw new IllegalArgumentException("Montant négatif");
        } else if (montant > debitAutorise()) {
            throw new IllegalArgumentException("Montant supérieur au débit autorisé");
        } else {
            solde = solde - montant;
        }
    }

    /**
     * Crédite le compte du montant désiré renvoi une exception si le montant
     * est négatif
     *
     * @param montant du crédit
     */
    public void crediter(double montant) {
        if (montant < 0) {
            throw new IllegalArgumentException("Montant négatif");
        } else {
            solde = solde + montant;
        }
    }

    /**
     * Virement du compte courant au compte désiré la fonction renvoie une
     * exception si le montant est négatif ou si le découvert maximum est
     * dépassé
     *
     * @param montant du virement
     * @param c compte du receveur
     */
    public void virement(double montant, Compte c) {
        this.debiter(montant);
        c.crediter(montant);
    }

    /**
     * renvoi une chaine de caractère avec les informations relatives au compte
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Titulaire : " + titulaire + "\n Numero du Compte : "
                + numeroCompte + "\n Découvert : "
                + getDecouvert() + "\nDécouvert maximum autorisé : "
                + decouvertMax
                + "\nDébit maximum autorisé : " + debitMax + ", solde="
                + solde + "\nDébit autorisé : " + debitAutorise();
    }

}
