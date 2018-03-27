package tarea1;

import java.util.Scanner;

public class Tarea2 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] numeros = new int[20];
		System.out.print("Ingrese el numero clave: ");
		
		String str = s.nextLine();
		int nro = Integer.parseInt(str);
		
		System.out.println("Ingrese 20 números para comparar. ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Numero "+(i+1)+": ");
			numeros[i] = Integer.parseInt(s.nextLine());
		}
		
		System.out.println("Los números mayores al primero son los siguientes: ");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > nro) {
				System.out.println(numeros[i]);
			}
		}
		
	}

}
