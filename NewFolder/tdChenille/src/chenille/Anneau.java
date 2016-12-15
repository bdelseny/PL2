package chenille;

import java.awt.Graphics;

/**
 *
 * @author delsenyb
 */
public class Anneau {

    protected int x;
    protected int y;
    protected int r;

    /**
     * crée un Anneau en fixant sa position initiale et son rayon
     *
     * @param xInit abscisse du centre de l'anneau
     * @param yInit ordonnée du centre de l'anneau
     * @param r rayon de l'anneau
     */
    public Anneau(int xInit, int yInit, int r) {
        this.x = xInit;
        this.y = yInit;
        this.r = r;
    }

    /**
     * crée un Anneau en fixant sa position initiale, de rayon 5
     *
     * @param xInit abscisse du centre de l'anneau
     * @param yInit ordonnée du centre de l'anneau
     */
    public Anneau(int xInit, int yInit) {
        this(xInit, yInit, 5);
    }

    /**
     * retourne abscisse du centre de l'anneau
     *
     * @return abscisse du centre de l'anneau
     */
    public int getX() {
        return x;
    }

    /**
     * retourne ordonnée du centre de l'anneau
     *
     * @return ordonnée du centre de l'anneau
     */
    public int getY() {
        return y;
    }

    /**
     * positionne le centre de l'anneau en un point donné
     *
     * @param px abscisse du point
     * @param py ordonnée du point
     */
    public void placerA(int px, int py) {
        this.x=px;
        this.y=py;
    }

    /**
     * affiche l'anneau en le matérialisant par un cercle noir
     *
     * @param g objet de classe java.awt.Graphics qui prend en charge la gestion
     * de l'affichage dans la fenêtre de dessin
     */
    public void dessiner(Graphics g) {
        g.drawOval(x-r, y-r, r*2, r*2);
    }

}
