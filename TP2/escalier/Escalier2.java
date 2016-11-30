/**
* Affiche un motif triangulaire dont la taille est fixée par une valeur lue au clavier. 
* Boucle for
*
* @author Bastien Delseny
*/

import java.util.Scanner;

public class Escalier2{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int x, i, j;

		/* Nombre de marches */
		System.out.print("Entrez un nombre de marches : ");
		x = sc.nextInt();

		for(i=1; i<=x; i++){
			for(j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


