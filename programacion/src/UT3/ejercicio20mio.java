/**
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author irape
 * 20. Repetir el ejercicio anterior, 
 * pero mostrar al finalizar tambi�n la media de los n�meros introducidos. 
 */
public class ejercicio20mio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce numeros hasta llegar a 0: ");
		int numero = 1;
		int suma = 0;
		float contador = -1;
		
		while (numero != 0) {
			numero = sc.nextInt();
			suma = suma + numero;
			contador = contador + 1;
		}
		System.out.println("El resultado de la suma es: " + suma);	
		System.out.println("El resultado de la media es: " + suma / contador);
		sc.close();
	}
}
