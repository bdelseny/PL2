package chenille;

import java.awt.Graphics;

/**
 *
 * @author delsenyb
 */
public class Tete extends Anneau {

    private double cap;

    /**
     * crée une Tete en fixant sa position initiale, son rayon et son cap
     *
     * @param xInit abscisse du centre de l'anneau
     * @param yInit ordonnée du centre de l'anneau
     * @param r rayon de l'anneau
     * @param c cap de la tete
     */
    public Tete(int xInit, int yInit, int r, double c) {
        super(xInit, yInit, r);
        this.cap = c;
    }

    /**
     * modifie le cap de la tête en lui ajoutant la déviation
     *
     */
    public void devierCap() {
        this.cap = cap + (-30 + Math.random() * 60);
    }

    /**
     * modifie le centre de la tête en lui appliquant un déplacement de longueur
     * r dans la direction définie par le cap x′=x+r∗cos(cap) et y′=y+r∗sin(cap)
     *
     */
    public void deplacerSelonCap() {
        this.placerA((int) Math.round(x + r * Math.cos(Math.toRadians(cap))),
                (int) Math.round(y + r * Math.sin(Math.toRadians(cap))));
    }

    /**
     * vérifie que la tête restera dans l'affichage au prochain déplacement
     *
     * @param xMax bord abscisse de la zone de dessin
     * @param yMax  bord ordonnée de la zone de dessin
     * @return boolean vraie (true) si le cap actuel de la tête est tel que le
     * prochain déplacement maintiendra la tête entièrement dans la zone de
     * dessin
     */
    public boolean capOK(int xMax, int yMax) {
        int a = (int) Math.round(x + r * Math.cos(Math.toRadians(cap)));
        int b = (int) Math.round(y + r * Math.sin(Math.toRadians(cap)));
        if (a + r > xMax || a - r < 0) { // si on touche la droite ou la gauche
            return false;
        } else if (b + r > yMax || b - r < 0) { // si on touche le haut ou le bas
            return false;
        }
        return true; // On ne touche pas les bords
    }

    /**
     * affiche l'anneau en le matérialisant par un cercle noir
     *
     * @param g objet de classe java.awt.Graphics qui prend en charge la gestion
     * de l'affichage dans la fenêtre de dessin
     */
    @Override
    public void dessiner(Graphics g) {
        g.fillOval(x - r, y - r, r * 2, r * 2);
    }
}
