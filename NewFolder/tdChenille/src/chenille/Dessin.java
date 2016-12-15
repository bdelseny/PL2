package chenille;
/**
 * Dessin.java
 */
import java.awt.Graphics;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 * Defini le contenu de la fenêtre de l'application d'animation des VisageRond.
 * Une zone de dessin est un JPanel qui gère un liste d'objets VisageRond.
 * Lorsqu'il se réaffiche l'objet Dessin redessinne les différents objets
 * VisageRond contenus dans cette liste.
 *
 * @author Philippe Genoud
 * @version
 */
public class Dessin extends JPanel {

    /**
     * stocke la liste des VisageRond ayant été ajoutées à cette zone de dessin.
     */
    private final List<Chenille> listeChenilles = new ArrayList<>();

    /**
     * retourne la largeur de la zone de dessin.
     *
     * @return la largeur.
     */
    public int getLargeur() {
        return getWidth();
    }

    /**
     * retourne la hauteur de la zone de dessin.
     *
     * @return la hauteur.
     */
    public int getHauteur() {
        return getHeight();
    }

    /**
     * ajoute un VisageRond à la zone de dessin.
     *
     * @param c
     */
    public void ajouterObjet(Chenille c) {

        if (!listeChenilles.contains(c)) {
            // l'objet n'est pas déjà dans la liste
            // on le rajoute a la liste des objets du dessin
            listeChenilles.add(c);
            // le dessin se réaffiche
            repaint();
            this.pause(10);
        }
    }

    /**
     * temporisation de l'animation.
     * @param duree delai de temporisation en ms.
     */
    public void pause(int duree) {
        try {
            Thread.sleep(duree);
        } catch (Exception e) {
        }
    }

    /**
     * affiche la zone de dessin et son contenu
     *
     * @param g le contexte graphique
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // on dessine chacun des visages contenus dans la zone de dessin
        for (Chenille c : listeChenilles) {
            c.dessiner(g);
        }
    }

} // Dessin

