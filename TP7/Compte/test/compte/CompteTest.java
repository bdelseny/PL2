/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compte;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author delsenyb
 */
public class CompteTest {

    public CompteTest() {
    }
    
    static Titulaire meu = new Titulaire("meu", "meu", "meu");
    static Compte c0 = new Compte(meu);
    Compte c1, c2;
    Titulaire gege, gegeine;

    @Before
    public void setUp() {
        gege = new Titulaire("Mentvue", "Gérard", "9 rue de l'aubépine");
        gegeine = new Titulaire("Hier", "Géraldine", "25 rue de la piscine");
        c1 = new Compte(gege);
        c2 = new Compte(gegeine, 1500, 250, 4000);
    }

    /**
     * Test of getTitulaire method, of class Compte.
     */
    @Test
    public void testGetTitulaire() {
        System.out.println("getTitulaire");
        Compte instance = c1;
        Titulaire expResult = gege;
        Titulaire result = instance.getTitulaire();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNumeroCompte method, of class Compte.
     */
    @Test
    public void testGetNumeroCompte() {
        System.out.println("getNumeroCompte1");
        Compte instance = c0;
        int expResult = 1;
        int result = instance.getNumeroCompte();
        System.out.println(result);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getDecouvertMax method, of class Compte.
     */
    @Test
    public void testGetDecouvertMax() {
        System.out.println("getDecouvertMax");
        Compte instance = c2;
        double expResult = 1500;
        double result = instance.getDecouvertMax();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getDebitMax method, of class Compte.
     */
    @Test
    public void testGetDebitMax() {
        System.out.println("getDebitMax");
        Compte instance = c1;
        double expResult = 1000;
        double result = instance.getDebitMax();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getSolde method, of class Compte.
     */
    @Test
    public void testGetSolde() {
        System.out.println("getSolde");
        Compte instance = c2;
        double expResult = 4000;
        double result = instance.getSolde();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setDecouvertMax method, of class Compte.
     */
    @Test
    public void testSetDecouvertMax() {
        System.out.println("setDecouvertMax");
        Compte instance = c1;
        instance.setDecouvertMax(1000);
        assertEquals(1000,instance.getDecouvertMax(), 0.0);
    }

    /**
     * Test of setDebitMax method, of class Compte.
     */
    @Test
    public void testSetDebitMax() {
        System.out.println("setDebitMax");
        Compte instance = c1;
        instance.setDebitMax(1000);
        assertEquals(1000,instance.getDebitMax(), 0.0);
    }

    /**
     * Test of debitAutorise method, of class Compte.
     */
    @Test
    public void testDebitAutorise() {
        System.out.println("debitAutorise");
        Compte instance = c1;
        double expResult = 800;
        double result = instance.debitAutorise();
        assertEquals(expResult, result, 0.0);
        
        instance.setDebitMax(100);
        expResult = 100;
        result = instance.debitAutorise();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of debiter method, of class Compte.
     */
    @Test (expected = IllegalArgumentException.class)
    public void testDebiter() {
        System.out.println("debiter");
        double montant = -50;
        Compte instance = c1;
        instance.debiter(montant);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testDebiter2() {
        System.out.println("debiter");
        double montant = 500000;
        Compte instance = c1;
        instance.debiter(montant);
    }
    
    @Test 
    public void testDebiter3() {
        System.out.println("debiter");
        double montant = 200;
        Compte instance = c1;
        instance.debiter(montant);
        assertEquals(instance.getSolde(),-200,0.0);
    }

    /**
     * Test of crediter method, of class Compte.
     */
    @Test (expected = IllegalArgumentException.class)
    public void testCrediter() {
        System.out.println("crediter");
        double montant = -200;
        Compte instance = c1;
        instance.crediter(montant);
    }

    @Test
    public void testCrediter1() {
        System.out.println("crediter");
        double montant = 200;
        Compte instance = c1;
        instance.crediter(montant);
        assertEquals(instance.getSolde(),200,0.0);
    }
    /**
     * Test of virement method, of class Compte.
     */
    @Test
    public void testVirement() {
        System.out.println("virement");
        double montant = 200;
        Compte c = c2;
        Compte instance = c1;
        instance.virement(montant, c);
        assertEquals(instance.getSolde(), -200, 0.0);
        assertEquals(c.getSolde(), 4200, 0.0);
    }

    /**
     * Test of toString method, of class Compte.
     */
    @Test 
    public void testToString() {
        System.out.println("toString");
        assertFalse(c1.toString().contains("@"));
    }
    
    /**
     * Test getDecouvert
     */
    @Test
    public void testGetDecouvert(){
        System.out.println("decouvert");
        double montant = 200;
        Compte instance = c1;
        instance.debiter(montant);
        
        assertEquals(instance.getDecouvert(), 200, 0.0);
    }
    
    /**
     * test changerAdresse
     */
    @Test
    public void testChangerAdresse(){
        System.out.println("adresse");
        Compte instance = c1;
        instance.changerAdresse("@");
        assertEquals("@", instance.getTitulaire().getAdresse());
    }
}
