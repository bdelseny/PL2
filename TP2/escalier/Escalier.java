/**
* Affiche un motif triangulaire dont la taille est fixée par une valeur lue au clavier. 
* Boucle while
*
* @author Bastien Delseny
*/

import java.util.Scanner;

public class Escalier{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int x, i, j;
		i = 1;
		j = 1;

		/* Nombre de marches */
		System.out.print("Entrez un nombre de marches : ");
		x = sc.nextInt();

		while(i<=x){
			while(j<=i){
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
			j = 1;
		}
	}
}


