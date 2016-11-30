/**
* Détermine si un point se trouve ou non à l'intérieur de la couronne 
* de centre l'origine et définie par son rayon extérieur et son rayon intérieur.
*
* @author Bastien DELSENY
*/

import java.util.Scanner;

public class Couronne {
	
	public static void main(String[] args){
		
		/* Initialisation des valeurs */
		double rint, rext, x, y;
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.print("Rayon intérieur : ");
			rint = sc.nextDouble();
			System.out.print("Rayon extérieur : ");
			rext = sc.nextDouble();
		}while(rint>rext); //Si rint <= rext on continue sinon redemander les valeurs
		
		/* Abscisse et ordonnée du point à tester */
		System.out.print("Abscisse du point : ");
		x = sc.nextDouble();
		System.out.print("Ordonnée du point : ");
		y = sc.nextDouble();

		/* Calcul pour savoir si le point est dans la couronne */
		if((Math.hypot(x, y) >= rint) && (Math.hypot(x, y) <= rext)){ //Le point est dans la couronne
			System.out.println("Le point est dans la couronne !");
		} else { // Le point n'est pas dans la couronne
			System.out.println("Raté le point n'est pas dans la couronne !");
		}
	}
}

		

