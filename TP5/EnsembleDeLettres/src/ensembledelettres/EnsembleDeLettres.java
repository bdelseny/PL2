
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
     * @return {e,n,s,e,m,b,l,e}  l'ensemble de lettres
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
        return false;
    }
    
    /**
     * Cardinal de l'ensemble (nombre d'éléments)
     * @return entier  cardinal de l'ensemble
     */
    public int cardinal(){
        return 0;
    }
    
    /**
     * Test l'inclusion de l'ensemble dans un autre ensemble
     * @param e  l'ensemble à tester
     * @return booléen  vrai si l'ensemble est inclut dans l'autre ensemble
     */
    public boolean inclusion(EnsembleDeLettres e){
        return false;
    }
    
    /**
     * Test si la lettre spécifiée est présente dans l'ensemble
     * @param l  lettre à tester
     * @return booléen  vrai si la lettre est présente dans l'ensemble
     */
    public boolean estPresente(char l){
        return false;
    }
    
    /**
     * Génère l'ensemble d'intersection entre
     * l'ensemble courant et un autre ensemble
     * @param e  l'autre ensemble
     * @return EnsembleDeLettres est l'intersection des deux ensembles
     */
    public EnsembleDeLettres creerIntersection(EnsembleDeLettres e){
        return null;
    }
    
    /**
     * Génère un ensemble d'union entre
     * l'ensemble courant et un autre ensemble
     * @param e  l'autre ensemble
     * @return EnsembleDeLettres est l'union des deux ensembles
     */
    public EnsembleDeLettres creerUnion(EnsembleDeLettres e){
        return null;
    }
    
    /**
     * Génère un ensemble de différence entre
     * l'ensemble courant et un autre ensemble
     * @param e  l'autre ensemble
     * @return EsembleDeLettres est la différence des deux ensembles
     */
    public EnsembleDeLettres creerDifference(EnsembleDeLettres e){
        return null;
    }
    
    /**
     * Génère un ensemble d'union disjointe entre
     * l'ensemble courant et un autre ensemble
     * @param e  l'autre ensemble
     * @return EsembleDeLettres est l'union disjointe des deux ensembles
     */
    public EnsembleDeLettres creerUnionDisjointe(EnsembleDeLettres e){
        return null;
    }
}
