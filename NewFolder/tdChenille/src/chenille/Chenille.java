package chenille;

import java.awt.Graphics;

/**
 *
 * @author delsenyb
 */
public class Chenille {

    private final Tete t;
    private final Anneau[] a;
    private final Dessin d;

    public Chenille(int nbAnneau, int r, Dessin d) {
        this.d = d;
        this.t = new Tete(d.getWidth() / 2, d.getHeight() / 2, r, 0);
        a = new Anneau[nbAnneau-1];
        for (int i = 0; i < nbAnneau-1; i++) {
            a[i] = new Anneau(d.getWidth() / 2 - (i + 1) * r, d.getHeight() / 2, r);
        }
    }

    /**
     * dessine la chenille
     *
     * @param g dessin
     */
    public void dessiner(Graphics g) {
        t.dessiner(g);
        for (Anneau al : a) {
            al.dessiner(g);
        }
    }

    /**
     * deplace la chenille d'un déplacement élémentaire
     */
    public void deplacer() {
        int i = a.length - 1;
        while (i > 0) {
            a[i].placerA(a[i - 1].getX(), a[i - 1].getY());
            i--;
        }
        a[0].placerA(t.getX(), t.getY());
        
        t.devierCap();
        while (!t.capOK(d.getWidth(), d.getHeight())) {
            t.devierCap();
        }
        
        t.deplacerSelonCap();
        
    }
}
