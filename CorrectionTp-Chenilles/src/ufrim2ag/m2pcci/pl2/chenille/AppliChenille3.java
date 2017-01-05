package ufrim2ag.m2pcci.pl2.chenille;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * Ouvre une fenêtre et affiche plusieurs chenilles intialement toutes
 * positionnées au centre de la fenêtre et qui ensuite se déplacent de manière
 * aléatoire. Une chenille sur deux est une chenille "normale", l'autre étant
 * une chenille colorée dont la couleur est fixée au hasard.<BR>
 * Le nombre de chenille peut être fixé par la ligne de commande; par exemple
 * pour avoir 6 chenilles :<BR>
 * <code>java AppliChenille3 6</code>
 *
 * @author Philippe Genoud - UGA - LIG Steamer
 */
public class AppliChenille3 {

    public static final int NBCH = 30;

    public static void main(String[] args) {

        int nbChenilles; // nombre de chenille a afficher

        if (args.length == 0) {
            nbChenilles = NBCH;
        } else {
            nbChenilles = Integer.parseInt(args[0]);
        }

        // création de la fenêtre de l'application
        JFrame laFenetre = new JFrame("Chenilles");
        laFenetre.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        laFenetre.setSize(512, 512);

        // création de la zône de dessin dans la fenêtre
        Dessin d = new Dessin();
        laFenetre.getContentPane().add(d);

        // affiche la fenêtre
        laFenetre.setVisible(true);

        // creation des chenilles. elles sont stockées dans un tableau et
        // ajoutées
        // à la zône de dessin. Les chenilles d'indice impair sont des chenilles
        // "normales"
        // les chenilles d'indice pair sont des chenilles colorées
        Chenille[] chen = new Chenille[nbChenilles];
        for (int i = 0; i < nbChenilles; i++) {
            if (i % 2 != 0) {
                chen[i] = new Chenille(d, 10, 10);
            } else {
                chen[i] = new ChenilleCouleur(
                        new Color((float) Math.random(), (float) Math.random(),
                                (float) Math.random()),
                        d, 10, 10
                );
            }
            d.ajouterObjet(chen[i]);
        }

        // la boucle d'animation
        while (true) {

            // fait réaliser aux chenilles un déplacement élémentaire
            for (Chenille ch : chen) {
                ch.deplacer();
            }

            // la zone de dessin se réaffiche
            d.repaint();

            // un temps de pause pour avoir le temps de voir le nouveau dessin
            d.pause(50);

        }
    }

} // AppliChenille3

