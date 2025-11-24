package Ejercicio7;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el número de filas (n): ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			// Parte ascendente
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			
			//Parte descendente
			for (int k = i-1; k >= 1; k--) {
				System.out.print(k);
			}
			
			System.out.println();
		}
		sc.close();
	}

}