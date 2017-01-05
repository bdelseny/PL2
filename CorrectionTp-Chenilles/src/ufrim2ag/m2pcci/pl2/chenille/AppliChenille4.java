package ufrim2ag.m2pcci.pl2.chenille;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * Ouvre une fenêtre et affiche plusieurs chenilles de différents type (Star War,
 * couleur, une chenille de Noel), initialement toutes positionnées au centre de la
 * fenêtre et qui ensuite se déplacent de manière aléatoire.
 *
 * Le nombre de chenille starwar, couleur et la vitesse d'animation (temps de
 * pause entre deux réaffichage) peuvent être contrôlés en les passant comme
 * arguments de la ligne de commande.
 *
 * Par exemple pour avoir 6 chenilles Star WAR, 5 chenilles couleur et un temps
 * de pause de 60ms <code>java AppliChenille4 6 5 60.</code>
 *
 * @author Philippe Genoud - UGA - LIG Steamer
 */
public class AppliChenille4 {

    /**
     * nombre de chenilles Star War par defaut
     */
    public static final int NBCH_SW = 5;
    
    public static final int NB_VISAGES = 5;

    /**
     * nombre de chenilles Star War par defaut
     */
    public static final int NBCH_COUL = 5;

    public static String[] tetesFileNames = {
        "images/darthVador.png",
        "images/leila.png",
        "images/c3po.png",
        "images/starTrooper.png"
    };

    /**
     * Les arguments de la ligne de commande, si ils sont présent, définissent
     * dans leur ordre d'apparition:
     *
     * - le nombre de chenilles Star War (sachant qu'il y a une seule princesse
     * Leila, un seul Darth Vador, tout le reste étant des Stormtroopers). La
     * valeur par défaut si cet argument est absent est 5.
     *
     * - le nombre de chenilles en couleur. La valeur par défaut si cet argument
     * est absent est 5.
     *
     * - la vitesse d'animation. La valeur par défaut si cet argument est absent
     * est 100ms.
     *
     * @param args arguments de la ligne de commande
     * @throws IOException si une image pour une tête de Chenille n'est pas
     * trouvée
     */
    public static void main(String[] args) throws IOException {

        int nbChenillesStarWar = NBCH_SW; // nombre de chenille Star War à afficher
        int nbChenillesCoul = NBCH_COUL;  // nombre de chenille couleur à afficher
        int tempsPause = 100; // temps de pause entre deux réafficahge (en ms).
        BufferedImage[] images = new BufferedImage[tetesFileNames.length];
        for (int i = 0; i < images.length; i++) {
            images[i] = ImageIO.read(new File(tetesFileNames[i]));
        }

        if (args.length >= 1) {
            nbChenillesStarWar = Integer.parseInt(args[0]);
            if (args.length >= 2) {
                nbChenillesCoul = Integer.parseInt(args[1]);
            }
            if (args.length >= 3) {
                tempsPause = Integer.parseInt(args[2]);
            }
        }

        // création de la fenêtre de l'application
        JFrame laFenetre = new JFrame("Chenilles");
        laFenetre.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        laFenetre.setSize(1280, 720);

        // création de la zône de dessin dans la fenêtre
        Dessin d = new Dessin();
        laFenetre.getContentPane().add(d);
        // affiche la fenêtre
        laFenetre.setVisible(true);
        // creation des chenilles. elles sont stockées dans un tableau et
        // ajoutées à la zône de dessin
        Chenille[] chen = new Chenille[nbChenillesStarWar + nbChenillesCoul];
        for (int i = 0; i < nbChenillesStarWar; i++) {

            chen[i] = new ChenilleImage(d, 10, (i < 3) ? images[i] : images[3]);

            d.ajouterObjet(chen[i]);
        }
        for (int i = 0; i < nbChenillesCoul; i++) {
            chen[nbChenillesStarWar + i] = new ChenilleCouleur(
                    new Color((float) Math.random(),
                            (float) Math.random(),
                            (float) Math.random()),
                    d, 10, 15);
            d.ajouterObjet(chen[nbChenillesStarWar + i]);
        }

        // la chenille de Noel
        Chenille cNoel = new ChenilleImage(d, 0, ImageIO.read(new File("images/chenilleNoel.png")));
        d.ajouterObjet(cNoel);
        
        // Des visages
        VisageRond[] vRond = new VisageRond[NB_VISAGES];
        int p, l;
        p=0;
        l=5;
        for (int i = 0; i<NB_VISAGES; i++){
            vRond[i] = new VisageRond(d, p, p, l, l);
            p += 20;
            l += 20;
        d.ajouterObjet(vRond[i]);
        }
        
        // Des Etoiles
        Etoile e1 = new Etoile( 400, 500,  100, Color.RED, Color.YELLOW);
        d.ajouterObjet(e1);
        Etoile e2 = new Etoile( 600, 400, 50, Color.BLUE, Color.GREEN);
        d.ajouterObjet(e2);
        
        // Polygones réguliers
        PolygoneRegulier p1 = new PolygoneRegulier(3, 
                150, 150, 100, Color.CYAN, Color.MAGENTA);
        d.ajouterObjet(p1);
        PolygoneRegulier p2 = new PolygoneRegulier(8, 
                400, 150, 50, Color.GREEN, Color.PINK);
        d.ajouterObjet(p2);
        
        // la boucle d'animation
        while (true) {

            // fait réaliser aux chenilles un déplacement élémentaire
            for (Chenille ch : chen) {
                ch.deplacer();
            }
            cNoel.deplacer();
            for (VisageRond v : vRond){
                v.deplacer();
            }

            // la zone de dessin se réaffiche
            d.repaint();

            // un temps de pause pour avoir le temps de voir le nouveau dessin
            d.pause(tempsPause);

        }

    }

} // AppliChenille2

