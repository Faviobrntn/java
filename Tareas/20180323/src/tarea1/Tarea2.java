package tarea1;

import java.util.Scanner;

public class Tarea2 {
	
	private static Scanner s;
	
	public static void main(String[] args) {

		int[] numeros = new int[20];
		System.out.print("Ingrese el numero clave: ");
		s = new Scanner(System.in);
		String str = s.nextLine();
		int nro = Integer.parseInt(str);
		
		System.out.println("Ingrese 20 números para comparar. ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Numero "+(i+1)+": ");
			s = new Scanner(System.in);
			String palab = s.nextLine();
			numeros[i] = Integer.parseInt(palab);
		}
		
		System.out.println("Los números mayores al primero son los siguientes: ");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > nro) {
				System.out.println(numeros[i]);
			}
		}
		
	}

}
