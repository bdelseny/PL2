/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufrim2ag.m2pcci.pl2.chenille;

import java.awt.Color;

/**
 *
 * @author delsenyb
 */
public class Etoile extends FormeCirculaireReguliere {
    
    // ------ Constructeurs ---------------------------------------------
    /**
     * Construit une étoile à partir des abscisses et ordonnées, du rayon,
     * de la couleur de son contour et de remplissage
     * @param xInit
     * @param yInit
     * @param rInit
     * @param trait
     * @param remplissage 
     */
    public Etoile(int xInit, int yInit, int rInit, Color trait, Color remplissage){
        super(5, xInit, yInit, rInit, trait, remplissage);

        // Etape 2
        // construction du chemin reliant les points

        contour.moveTo(sommets[0].getX(), sommets[0].getY());
        contour.lineTo(sommets[2].getX(), sommets[2].getY());
        contour.lineTo(sommets[4].getX(), sommets[4].getY());
        contour.lineTo(sommets[1].getX(), sommets[1].getY());
        contour.lineTo(sommets[3].getX(), sommets[3].getY());
        contour.closePath();
    }
}
