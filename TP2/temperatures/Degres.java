/**
* Lit une température exprimée en degrés Fahrenheit et affiche sa valeur 
* en degrés centigrades ou degrés Celsius.
* <p>
* En utilisant la formule C = (5/9)(F-32)
* </p>
* 
* @author 
*/

import java.util.Scanner;

public class Degres {

	public static void main(String[] args) {
		
		double f, c;
		Scanner sc = new Scanner(System.in);

		System.out.print("donnez une température en Fahrenheit : ");
		f = sc.nextDouble();

		c = (5.0/9.0)*(f-32.0);

		System.out.println("Cette température équivaut à " + c + " degrés Celsius !");
	}
}


