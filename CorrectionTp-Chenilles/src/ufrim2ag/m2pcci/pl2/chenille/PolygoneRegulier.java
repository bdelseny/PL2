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
public class PolygoneRegulier extends FormeCirculaireReguliere {

    // ------ Constructeurs ---------------------------------------------

    /**
     * Construit une étoile à partir des abscisses et ordonnées, du rayon, de la
     * couleur de son contour et de remplissage
     *
     * @param nbSommets
     * @param xInit
     * @param yInit
     * @param rInit
     * @param trait
     * @param remplissage
     */
    public PolygoneRegulier(int nbSommets, int xInit, int yInit, int rInit, Color trait,
            Color remplissage) {
        super(nbSommets, xInit, yInit, rInit, trait, remplissage);

        // Etape 2
        // construction du chemin reliant les points
        contour.moveTo(sommets[0].getX(), sommets[0].getY());
        for (int i = 1; i < nbSommets; i++) {
            contour.lineTo(sommets[i].getX(), sommets[i].getY());
        }
        contour.closePath();
    }
}
