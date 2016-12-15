package chenille;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * Animation d'un visage dans une fenêtre graphique. Un visage est dessiné à
 * l'intérieur d'une fenêtre et se déplace. Chaque fois que l'un des bords est
 * atteint, le visage change de direction.
 *
 * @author Philippe Genoud
 */
public class JeuChenille {

    public static void main(String[] args) {

        // la fenêtre graphique
        JFrame laFenetre = new JFrame("VISAGES ANIMES");
        laFenetre.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        laFenetre.setSize(640, 640);

        // créé la zone de dessin et la place dans la fenêtre
        Dessin d = new Dessin();
        laFenetre.add(d);

        //  affiche la fenêtre
        laFenetre.setVisible(true);

        // creation d'un objet Tableau de chenilles
        int n = 100;
        Chenille[] chen = new Chenille[n];

        // ajout de cet objet à la zone de dessin

        for (int i = 0; i < n; i++) {
            chen[i] = new Chenille(10, 10, d);
            d.ajouterObjet(chen[i]);
        }

        // la boucle d'animation
        // c'est une boucle infinie, le programme devra être interrompu
        // par CTRL-C ou en cliquant dans le cas de fermeture de la fenêtre
        while (true) {
            for (int i = 0; i < n; i++) {
                chen[i].deplacer();
            }

            // la zone de dessin se réaffiche
            d.repaint();

            // un temps de pause pour avoir le temps de voir le nouveau dessin
            d.pause(50);

        }
    }

} // AppliVisage1

