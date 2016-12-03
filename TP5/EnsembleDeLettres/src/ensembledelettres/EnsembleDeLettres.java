package ensembledelettres;

/**
 * Ensemble de lettres non duppliquées
 *
 * @author delsenyb
 */
public class EnsembleDeLettres {

    private boolean[] present;

    /**
     * Converti un caractère en entier
     *
     * @param a le caractère à convertir
     * @return b l'entier qui correspond à a
     */
    private int charToInt(char a) {
        int b;
        b = (int) a - 97;
        return b;
    }

    /**
     * Converti un entier en caractère
     *
     * @param a l'entier à convertir
     * @return b le caractère correspondant à l'indice a
     */
    private char intToChar(int a) {
        char b;
        b = (char) (a + 97);
        return b;
    }

    /**
     * Construit un ensemble de lettre qui peut être vide ou aléatoire
     *
     * @param vide vrai le tableau est vide
     */
    public EnsembleDeLettres(boolean vide) {
        present = new boolean[26];
        if (!vide) {
            int a;
            for (int i = 0; i < 26; i++) {
                present[i] = Math.round(Math.random()) == 1;
            }
        }
    }

    /**
     * Construit un ensemble de lettres suivant les lettres choisis
     *
     * @param a lettres en entrées
     */
    public EnsembleDeLettres(String a) {
        this(true);
        int x;
        for (int i = 0; i < a.length(); i++) {
            x = charToInt(a.charAt(i));
            present[x] = true;
        }
    }

    /**
     * Affiche l'ensemble de lettres
     *
     * @return {e,n,s,e,m,b,l,e} l'ensemble de lettres
     */
    @Override
    public String toString() {
        char lettre;
        String ensemble = new String();
        for (int i = 0; i < 26; i++) {
            if (present[i]) {
                lettre = intToChar(i);
                ensemble = ensemble + lettre + ",";
            }
        }
        return "{" + ensemble + "}";
    }

    /**
     * Test si l'ensemble est vide
     *
     * @return booléen vrai si ensemble vide
     */
    public boolean estVide() {
        return false;
    }

    /**
     * Cardinal de l'ensemble (nombre d'éléments)
     *
     * @return entier cardinal de l'ensemble
     */
    public int cardinal() {
        return 0;
    }

    /**
     * Test l'inclusion de l'ensemble dans un autre ensemble
     *
     * @param e l'ensemble à tester
     * @return booléen vrai si l'ensemble est inclut dans l'autre ensemble
     */
    public boolean inclusion(EnsembleDeLettres e) {
        return false;
    }

    /**
     * Test si la lettre spécifiée est présente dans l'ensemble
     *
     * @param l lettre à tester
     * @return booléen vrai si la lettre est présente dans l'ensemble
     */
    public boolean estPresente(char l) {
        return false;
    }

    /**
     * Génère l'ensemble d'intersection entre l'ensemble courant et un autre
     * ensemble
     *
     * @param e l'autre ensemble
     * @return EnsembleDeLettres est l'intersection des deux ensembles
     */
    public EnsembleDeLettres creerIntersection(EnsembleDeLettres e) {
        return null;
    }

    /**
     * Génère un ensemble d'union entre l'ensemble courant et un autre ensemble
     *
     * @param e l'autre ensemble
     * @return EnsembleDeLettres est l'union des deux ensembles
     */
    public EnsembleDeLettres creerUnion(EnsembleDeLettres e) {
        return null;
    }

    /**
     * Génère un ensemble de différence entre l'ensemble courant et un autre
     * ensemble
     *
     * @param e l'autre ensemble
     * @return EsembleDeLettres est la différence des deux ensembles
     */
    public EnsembleDeLettres creerDifference(EnsembleDeLettres e) {
        return null;
    }

    /**
     * Génère un ensemble d'union disjointe entre l'ensemble courant et un autre
     * ensemble
     *
     * @param e l'autre ensemble
     * @return EsembleDeLettres est l'union disjointe des deux ensembles
     */
    public EnsembleDeLettres creerUnionDisjointe(EnsembleDeLettres e) {
        return null;
    }
}
