/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hjms;

import java.util.Scanner;


/**
 * Prend des secondes en entrée et affiche l'équivalent en 
 * Jours, heures, minutes, secondes.
 * 
 * @author delsenyb
 */
public class Hjms {

    /**
     * Jours = Entree/86400 soit 60*60*24 <br>
     * Heures = modulo(Entree/86400)/3600 soit 60*60 <br>
     * Minutes = modulo(modulo(Entree/86400)/3600)/60 <br>
     * Secondes = modulo(modulo(modulo(Entree/86400)/3600)/60) <br>
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int entree, h, j, m, s, modulo;
        Scanner sc = new Scanner(System.in);
        
        /* Entree */
        System.out.print("Donnez une durée en secondes : ");
        entree = sc.nextInt();
        
        /* Jour */
        j = entree/86400;
        
        /* Heures */
        modulo = entree%86400;
        h = modulo/3600;
        
        /* Minutes */
        modulo = modulo%3600;
        m = modulo/60;
        
        /* Secondes */
        s = modulo%60;
        
        /* Affichage du résultat */
        System.out.println("Ceci équivaut à " + j + " jours, " + h + " heures, " + m + " minutes, " + s + " secondes.");
        
    }
    
}
