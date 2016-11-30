/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibo2;
import java.util.Scanner;

/**
 * Lit une valeur et 
 * affiche le rang et la valeur de la suite de fibonacci la plus proche
 * 
 * @author delsenyb
 */
public class Fibo2 {

    /**
     * Calcul de la suite de Fibonacci pour n donné
     * <p>
     * <b>Pré-condition :</b> n supérieur ou égal à 3
     * </p>
     *
     * @param n le ième terme de la suite
     * @return un, la valeur de u pour le ieme élément
     */
    public static int suiteFibo(int n) {
        int u, n1, n2;
        if (n == 2) {
            u = 1;
        } else if (n == 3) {
            u = 2;
        } else {
            n1 = n - 1;
            n2 = n - 2;
            u = suiteFibo(n1) + suiteFibo(n2);
        }
        return u;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v, r, u, n;
        u = 0;
        n = 1;
        
        /* Récupération de la valeur */
        System.out.print("Valeur : ");
        v = sc.nextInt();
        while(u<v){
            n++;
            u = suiteFibo(n);
        }
        System.out.println("Valeur : " + u + " rang : " + n);
    }

}
