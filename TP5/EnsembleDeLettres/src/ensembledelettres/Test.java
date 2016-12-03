/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ensembledelettres;

import ufrim2ag.m2pcci.pl2.tp3.EnsembleDeLettres1;


/**
 *
 * @author delsenyb
 */
public class Test {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // Eensemble eV vide
        EnsembleDeLettres eV;
        eV = new EnsembleDeLettres(true);
        System.out.println("eV : {} " + eV);
        
        // Ensemble e1 azerty
        EnsembleDeLettres e1;
        e1 = new EnsembleDeLettres("azertyztzza");
        System.out.println("e1 : " + e1);
        
        // Ensemble e2 qwerty
        EnsembleDeLettres1 e2;
        e2 = new EnsembleDeLettres1("qwertyyyrr");
        System.out.println("e2 : " + e2);
        
        // Enesemble e3 xcvb
        EnsembleDeLettres1 e3;
        e3 = new EnsembleDeLettres1("xcvb");
        System.out.println("e3 : " + e3);
        
//        // Intersection e1 et e2
//        System.out.println("Intersection e1 et e2 : {b,c,v,x} :");
//        System.out.println(e1.intersection1(e2));
//        
//        // Intersection e1 et e3
//        System.out.println("Intersection e1 et e3 : {} :");
//        System.out.println(e1.intersection1(e3));
//        
//        // Intersection e1, e2 et e3
//        System.out.println("Union e1, e2 et e3 : {a,b,c,e,q,r,t,v,w,x,y,z} :");
//        System.out.println(e1.union(e2.union(e3)));
        
        
    }
}
