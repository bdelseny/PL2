
package rational;

/**
 * Classe de rationnel <br>
 * 
 * Avec un numérateur n <br>
 * et un dénominateur d
 * 
 * @author delsenyb
 */
public class Rational {

    private int num;
    private int denom;

    /**
     * Constructeur avec deux paramètres
     *
     * @param n numérateur
     * @param d dénominateur
     */
    public Rational(int n, int d) {
        int p;
        
        if (d == 0) {
            throw new IllegalArgumentException("Dénominateur nul");
        } else {
            p = pgcd(n, d);
            num = n/p;
            denom = d/p;
        }
    }
    
    /**
     * Constructeur sans paramètres <br>
     * num = 0 <br>
     * denom = 1
     */
    public Rational(){
        this(0, 1);
        System.out.println("Defaut : \nNumérateur : " + num + " \nDénominateur  : " + denom);
    }
    
    /**
     * 
     * @return n numérateur
     */
    public int getNum(){
        return num;
    }
    
    /**
     * 
     * @return d denominateur
     */
    public int getDenom() {
        return denom;
    }
    
    /**
     * Représentation textuelle du rationnel
     * @return n/d n le numérateur, d le dénominateur
     */
    @Override
    public String toString() {
        return  + num + "/" + denom;
    }
    
    /**
     * Multiplie le rationel à un autre rationel
     * @param r le rationel à multiplier 
     */
    public void mult(Rational r) {
        this.num = this.num * r.getNum();
        this.denom = this.denom * r.getDenom();
    }
    
    /**
     * Additionne le rationel à un autre rationel
     * @param r le rationel à additionner
     */
    public void add(Rational r){
        this.num = ( this.num * r.getDenom() ) + ( r.getNum() * this.denom );
        this.denom = this.denom * r.getDenom();
    }
    
    /**
     * Retourne le plus grand diviseur commun à deux entiers
     * @param a
     * @param b
     * @return pgcd le plus grand diviseur commun à a et b
     */
    private int pgcd(int a, int b){
        if(b == 0){
            return a;
        } else {
            return pgcd(b, a%b);
        }
    }
}
