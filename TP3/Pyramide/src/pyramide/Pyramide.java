/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramide;
import java.util.Scanner;

/**
 * Lit le nombre d'étages et crée une pyramide du nombre d'étages.
 * 
 * @author delsenyb
 */
public class Pyramide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nbEtages;
        Scanner sc = new Scanner(System.in);
        
        /* Nombre d'étages */
        System.out.print("Nombre d'étages ? ");
        nbEtages = sc.nextInt();
        
        /* Pyramide */
        for(int i=1; i<=nbEtages; i++){ // Iteration des étages
            for(int j=nbEtages; j>=i; j--){ // Espaces avant les *
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){ // Etoiles partie centrale et gauche
                System.out.print("*");
            }
            if(i>=2){
                for(int l=2; l<=i; l++){ // Etoiles à droite 
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    
}
