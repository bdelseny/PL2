/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package troisnombres;
import java.util.Scanner;

/**
 * 3 nombres au clavier, 
 * les classes dans l'ordre croissant 
 * et les affiche du plus petit au plus grand sur la console.
 * 
 * @author delsenyb
 */
public class TroisNombres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        
        /* Les nombres */
        System.out.print("1er nombre : ");
        a = sc.nextInt();
        System.out.print("2eme nombre : ");
        b = sc.nextInt();
        System.out.print("3eme nombre : ");
        c = sc.nextInt();
        
        if(a>=b){
            if(b>=c){ //a>b>c
                System.out.println("Les nombres dans l'ordre croissant : " + a + " " + b + " " + c);
            } else if(c>=a){ //c>b & a>=b => c>a>b
                System.out.println("Les nombres dans l'ordre croissant : " + c + " " + a + " " + b);
            } else { //a>c>b
                System.out.println("Les nombres dans l'ordre croissant : " + a +  " " + c +  " " + b);
            }
        } else if(c>=b){ //b>a => c>b>a
            System.out.println("Les nombres dans l'ordre croissant : " + c +  " " + b +  " " + a);
        } else if(c>=a){ // b>c>a
            System.out.println("Les nombres dans l'ordre croissant : " + b +  " " + c +  " " + a);
        } else { //b>a>c
            System.out.println("Les nombres dans l'ordre croissant : " + b +  " " + a +  " " + c);
        }
        
    }
    
}
