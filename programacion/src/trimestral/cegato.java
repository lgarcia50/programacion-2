package trimestral;

import java.util.Scanner;

public class cegato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		char[][] mapa = new char[10][10]; // X, H y puntos.

		for (int i = 0; i < mapa.length; i++) {
			for (int j = 0; j < mapa.length; j++) {
				int n = (int) (Math.random() * 2); // generador random entre 0 y 1

				switch (n) {

				case 1:
					mapa[i][j] = 'X';
					break;

				default:
					mapa[i][j] = '.';
					break;
				}
			}
		}
		System.out.println("Dame la posicion en fila del heroe: ");
		int fila = sc.nextInt();
		System.out.println("Dame la posicion en columna del heroe: ");
		int columna = sc.nextInt();
		mapa[fila][columna] = 'H';
		
		//pintar mapa
		for (int i = 0; i < mapa.length; i++) { 
			for (int j = 0; j < mapa.length; j++) {
				System.out.print(mapa[i][j] + " ");
			}
			System.out.print("\n");
		}
		sc.close();
	}
	
}
