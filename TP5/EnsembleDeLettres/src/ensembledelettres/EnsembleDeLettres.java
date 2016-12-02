
package ensembledelettres;

/**
 * Ensemble de lettres non duppliquées
 * 
 * @author delsenyb
 */
public class EnsembleDeLettres {
    private String[] e;
    
    /**
     * Construit un ensemble de lettre vide
     */
    public EnsembleDeLettres() {
    }
    
    /**
     * Construit un ensemble de lettres de i lettres
     * @param i  nombre de lettres (0<i<=26)
     */
    public EnsembleDeLettres(int i) {
    }

    /**
     * Construit un ensemble de lettres suivant les lettres choisis
     * @param a  lettres en entrées
     */
    public EnsembleDeLettres(String[] a) {
        // Tester si répétition de lettres dans a
    }
    
    /**
     * Affiche l'ensemble de lettres
     * @return {e,n,s,e,m,b,l,e}
     */
    @Override
    public String toString() {
        return "{" + "}";
    }
    
    /**
     * Test si l'ensemble est vide
     * @return booléen  vrai si ensemble vide
     */
    public boolean estVide(){
        return ;
    }
    
    /**
     * Cardinal de l'ensemble (nombre d'éléments)
     * @return entier
     */
    public int cardinal(){
        return ;
    }
    
    /**
     * Test l'inclusion de l'ensemble dans un autre ensemble
     * @param e1
     * @return booléen  vrai si l'ensemble est inclut dans l'autre ensemble
     */
    public boolean inclusion(EnsembleDeLettres e1){
        return ;
    }
    
    /**
     * Test si la lettre spécifiée est présente dans l'ensemble
     * @param l
     * @return booléen  vrai si la lettre est présente dans l'ensemble
     */
    public boolean estPresente(char l){
        return ;
    }
    
    
}
