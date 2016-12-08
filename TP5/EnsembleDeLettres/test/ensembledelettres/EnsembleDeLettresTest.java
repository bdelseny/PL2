/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ensembledelettres;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author delsenyb
 */
public class EnsembleDeLettresTest {
    
    public EnsembleDeLettresTest() {
    }
    
    /**
     * Test la creation de classes aleatoires
     */
    @Test
    public void ensembleAleaTest(){
        System.out.println("EnsembleDeLettres aléatoires");
        EnsembleDeLettres instance = new EnsembleDeLettres(false);
        boolean result = instance.estVide();
        boolean expResult = false;
        assertEquals(expResult, result);
    }
    
    /**
     * Test of toString method, of class EnsembleDeLettres.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        EnsembleDeLettres instance = new EnsembleDeLettres("ajouajou");
        String expResult = "{a, j, o, u}";
        String result = instance.toString();
        assertEquals(expResult, result);
        System.out.println(result);
    }
    
    /**
     * Test of toString method, of class EnsembleDeLettres.
     */
    @Test
    public void testToString2() {
        System.out.println("toString");
        EnsembleDeLettres instance = new EnsembleDeLettres(true);
        String expResult = "{}";
        String result = instance.toString();
        assertEquals(expResult, result);
        System.out.println(result);
    }

    /**
     * Test of estVide method, of class EnsembleDeLettres.
     */
    @Test
    public void testEstVide() {
        System.out.println("estVide => true");
        EnsembleDeLettres instance = new EnsembleDeLettres(true);
        boolean expResult = true;
        boolean result = instance.estVide();
        assertEquals(expResult, result);
    }

     /**
     * Test of estVide method, of class EnsembleDeLettres.
     */
    @Test
    public void testEstVide2() {
        System.out.println("estVide => false");
        EnsembleDeLettres instance = new EnsembleDeLettres("abc");
        boolean expResult = false;
        boolean result = instance.estVide();
        assertEquals(expResult, result);
    }

    /**
     * Test of cardinal method, of class EnsembleDeLettres.
     */
    @Test
    public void testCardinal() {
        System.out.println("cardinal");
        EnsembleDeLettres instance = new EnsembleDeLettres("abc");
        int expResult = 3;
        int result = instance.cardinal();
        assertEquals(expResult, result);
    }

    /**
     * Test of inclusion method, of class EnsembleDeLettres.
     */
    @Test
    public void testInclusion() {
        System.out.println("inclusion");
        EnsembleDeLettres e = new EnsembleDeLettres("aghsy");
        EnsembleDeLettres instance = new EnsembleDeLettres(true);
        boolean expResult = true;
        boolean result = instance.inclusion(e);
        assertEquals(expResult, result);
    }

    /**
     * Test of inclusion method, of class EnsembleDeLettres.
     */
    @Test
    public void testInclusion2() {
        System.out.println("inclusion");
        EnsembleDeLettres e = new EnsembleDeLettres("aghsy");
        EnsembleDeLettres instance = new EnsembleDeLettres("gh");
        boolean expResult = true;
        boolean result = instance.inclusion(e);
        assertEquals(expResult, result);
    }

    /**
     * Test of inclusion method, of class EnsembleDeLettres.
     */
    @Test
    public void testInclusion3() {
        System.out.println("inclusion");
        EnsembleDeLettres e = new EnsembleDeLettres("aghsy");
        EnsembleDeLettres instance = new EnsembleDeLettres("z");
        boolean expResult = false;
        boolean result = instance.inclusion(e);
        assertEquals(expResult, result);
    }

    /**
     * Test of estPresente method, of class EnsembleDeLettres.
     */
    @Test
    public void testEstPresente() {
        System.out.println("estPresente");
        char l = 'a';
        EnsembleDeLettres instance = new EnsembleDeLettres("abc");
        boolean expResult = true;
        boolean result = instance.estPresente(l);
        assertEquals(expResult, result);
    }

    /**
     * Test of estPresente method, of class EnsembleDeLettres.
     */
    @Test
    public void testEstPresente2() {
        System.out.println("estPresente");
        char l = 'z';
        EnsembleDeLettres instance = new EnsembleDeLettres("abc");
        boolean expResult = false;
        boolean result = instance.estPresente(l);
        assertEquals(expResult, result);
    }

    /**
     * Test of creerIntersection method, of class EnsembleDeLettres.
     */
    @Test
    public void testCreerIntersection() {
        System.out.println("creerIntersection");
        EnsembleDeLettres e = new EnsembleDeLettres("abcd");
        EnsembleDeLettres instance = new EnsembleDeLettres("adskd");
        EnsembleDeLettres expResult = new EnsembleDeLettres("ad");
        EnsembleDeLettres result = instance.creerIntersection(e);
        System.out.println(expResult + "  " + result);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of creerUnion method, of class EnsembleDeLettres.
     */
    @Test
    public void testCreerUnion() {
        System.out.println("creerUnion");
        EnsembleDeLettres e = new EnsembleDeLettres("abc");
        EnsembleDeLettres instance = new EnsembleDeLettres("def");
        EnsembleDeLettres expResult = new EnsembleDeLettres("abcdef");
        EnsembleDeLettres result = instance.creerUnion(e);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of creerDifference method, of class EnsembleDeLettres.
     */
    @Test
    public void testCreerDifference() {
        System.out.println("creerDifference");
        EnsembleDeLettres e = new EnsembleDeLettres("abc");
        EnsembleDeLettres instance = new EnsembleDeLettres("cde");
        EnsembleDeLettres expResult = new EnsembleDeLettres("de");
        EnsembleDeLettres result = instance.creerDifference(e);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of creerUnionDisjointe method, of class EnsembleDeLettres.
     */
    @Test
    public void testCreerUnionDisjointe() {
        System.out.println("creerUnionDisjointe");
        EnsembleDeLettres e = new EnsembleDeLettres("abc");
        EnsembleDeLettres instance = new EnsembleDeLettres("cde");
        EnsembleDeLettres expResult = new EnsembleDeLettres("abde");
        EnsembleDeLettres result = instance.creerUnionDisjointe(e);
        assertEquals(expResult.toString(), result.toString());
    }
    
}
