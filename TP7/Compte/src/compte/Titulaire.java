/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compte;

/**
 *
 * @author delsenyb
 */
public class Titulaire {
    private final String nom;
    private final String prenom;
    private String adresse;
    
    /**
     * Création du titulaire
     * @param n  son nom
     * @param p  son prénom
     * @param a  son adresse
     */
    public Titulaire(String n, String p, String a){
        nom = n;
        prenom = p;
        adresse = a;
    }
    
    /**
     * Affiche le titulaire
     * @return 
     */
    @Override
    public String toString() {
        return "\n    Nom : " + nom + prenom + "\n    Adresse : " + adresse + '}';
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getAdresse() {
        return adresse;
    }
    
    
    
    
}
