/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellowolrd;
        
import java.util.Scanner;

/**
 *
 * @author delsenyb
 */
public class HelloWolrd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bonjour monde cruel !");

        for (int i = 0; i < args.length; i++) {
            System.out.println("Bonjour " + args[i]);
        }
        System.out.print("entrez votre nom : ");
        Scanner sc = new Scanner(System.in);
        String nom = sc.next();
        System.out.println("Au revoir " + nom);
    }
}
