/**
 * 16. Pedir dos n�meros y un intervalo al usuario y mostrar una lista del primero al segundo con ese intervalo. 
 */
package UT3;

import java.util.Scanner;

/**
 * @author Irasema
 *
 */
public class ejercicio16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Comentario 2 para entornos
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduzca el primer numero: ");
		int n1 = sc.nextInt();
		System.out.println("Introduzca el segundo numero: ");
		int n2 = sc.nextInt();
		System.out.println("Introduzca el intervalo: ");
		int intervalo = sc.nextInt();
		int resultado = n1;
		while (resultado >= n1 && resultado <=n2) {
		System.out.println(resultado);
		resultado = resultado + intervalo;
	}
	}
}
