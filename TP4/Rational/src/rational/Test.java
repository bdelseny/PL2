package rational;

/**
 * Programme de Test
 * @author delsenyb
 */
public class Test {
    
    public static void main(String[] args){
        Rational r;
        
        /* Création basic d'un rationel */
        System.out.println("Test du constructeur sans paramètres (0/1)");
        r = new Rational();
        System.out.println(r); // System.out.println(r.toString());
        
        /* Création du rationel 3/4 */
        r = new Rational(3, 4);
        System.out.println("Test du constructeur Rational (int n, int d) où n = 3 et d = 4\n" + r);
                
        /* Test mult */
        Rational r1 = new Rational(2, 5);
        r.mult(r1);
        System.out.println("Test mult(), attendu n = 2*3 = 6, d = 5*4 = 20");
        System.out.println(r);
        
        /* Test mult */
        r.add(r1);
        System.out.println("Test add(), attendu n = 6*5 + 20*2 = 70, d = 20*5 = 100");
        System.out.println(r);
        
        /* Test pgcd */
        r = new Rational(6,9);
        System.out.println("Test du pgcd n = 6, d = 9, attendu r = 2/3");
        System.out.println(r);
    }
}
