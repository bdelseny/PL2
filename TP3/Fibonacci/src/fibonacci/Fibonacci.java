/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 * Suite de Fibonacci <br>
 * définie par la formule de récurrence suivante: <br>
 * u1 = 1 u2 = 1 un = un-1 + un-2 <br>
 * <p>
 * <b>Pré-condition :</b> n supérieur ou égal 3
 * </p>
 *
 * @author delsenyb
 */
public class Fibonacci {

    /**
     * Calcul de la suite de Fibonacci pour n donné <br>
     * <p>
     * <b>Pré-condition :</b> n supérieur ou égal 3
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

        int n;
        int un;
        Scanner sc = new Scanner(System.in);

        /* n ? */
        System.out.print("Entrez une valeur pour n : ");
        n = sc.nextInt();

        /* U_n */
        un = suiteFibo(n);

        System.out.println("Un vaut : " + un);
    }

}
