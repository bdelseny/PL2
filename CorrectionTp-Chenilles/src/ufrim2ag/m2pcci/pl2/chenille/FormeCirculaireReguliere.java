/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufrim2ag.m2pcci.pl2.chenille;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;

/**
 *
 * @author delsenyb
 */
public abstract class FormeCirculaireReguliere implements Dessinable {
    /**
     * couleur du trait
     */
    protected Color couleurTrait;
    
    /**
     * couleur de remplissage
     */
    protected Color couleurRemplissage;
    
    /**
     * abscisse du point
     */
    protected int x;
    
    /**
     * ordonnée du point
     */
    protected int y;
    
    /**
     * contour
     */
    protected Path2D contour;
    
    /**
     * sommets du polygone
     */
    protected Point2D.Float[] sommets;
    
    // ------ Constructeurs ---------------------------------------------
    protected FormeCirculaireReguliere(int nbSommets, int xInit,
            int yInit, int rInit, Color trait, Color remplissage){
       
        this.x = xInit;
        this.y = yInit;
        int r = rInit;
        this.couleurTrait = trait;
        this.couleurRemplissage = remplissage;
        this.contour = new Path2D.Float();
        
        // Etape 1
        // calcul des sommets du polygone régulier
        float deltaAngle = 360f / nbSommets;
        float angle = -90;
        sommets = new Point2D.Float[nbSommets];
        for (int i = 0;
                i < nbSommets;
                i++) {
            sommets[i] = new Point2D.Float((float) Math.cos(Math.toRadians(angle)) * r,
                    (float) Math.sin(Math.toRadians(angle)) * r);
            angle += deltaAngle;
        }
    }
    
     /*-------------------------------
     Methodes
     -------------------------------*/
    /**
     * affiche la forme circulière régulière.
     *
     * @param g le contexte graphique de la zône de dessin en charge de
     * l'affichage.
     *
     * @see java.awt.Graphics
     * @see Dessinable
     */
    @Override
    public void dessiner(Graphics g) {
        
        // dessin à l'aide d'un objet Graphics g
        Graphics2D g2 = (Graphics2D) g.create();   // on crée une copie de g

        // Etape 3
        // dessin du contour
        g2.setColor(couleurTrait);

        g2.setStroke(
                new BasicStroke(8.0f));
        g2.translate(x, y);  // x et y le centre du cercle définissant l'étoile

        g2.draw(contour);

        // Etape 4
        // Remplissage de la forme
        g2.setPaint(couleurRemplissage);

        g2.fill(contour);
    }
    
}
