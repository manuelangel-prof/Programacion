package Ejercicio8;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		
		//Iniciamos el scanner
		Scanner sc = new Scanner(System.in);
		
		//Se pide el primer número
		System.out.print("Dame un numero: ");
		int numero = sc.nextInt();
		
		//Si el numero es el 0, no hay nada que procesar
		if (numero == 0) {
			System.out.println("Se terminó.");
			return;
		}
		
		int ultimo = numero;
		int correcto = 1;
		int fallos = 0;
		
		while (true) {
			System.out.print("Introduce un número: ");
			numero = sc.nextInt();
			
			if (numero == 0) {
				break;
			}
			
			if (numero > ultimo) {
				correcto++;
				ultimo = numero;
			} else {
				fallos++;
			}
		}
		
		System.out.print("Correctos: " + correcto);
		System.out.println();
		System.out.print("Fallos: " + fallos);
	}

}
