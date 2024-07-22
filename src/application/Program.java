package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// exericioMatriz01-diagonalNegativos
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		

		//Imprimir todos os elementos da matriz
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				System.out.printf("Elemento [%d,%d]: ", i,j);
				mat[i][j] = sc.nextInt();
			}
		}
		
		
		System.out.println("DIAGONAL PRINCIPAL:");
		// for para imprimir todos elementos da diagonal
		for (int i = 0; i < n; i++) {
			System.out.printf("%d ", mat[i][i]);
		}
		
		
		// for para percorrer todos os elementos e contar todos os números negativos digitados
		int count = 0;
		for(int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println();
		System.out.print("QUANTIDADE DE NEGATIVOS = " + count);
		
		sc.close();
	}

}
