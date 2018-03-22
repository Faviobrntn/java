package tarea1;

import java.util.Scanner;

public class Tarea1 {

	private static Scanner s;

	public static void main(String[] args) {

		String[] palabras = new String[20];
		
		for (int i = 0; i < palabras.length; i++) {
			System.out.println("Palabra "+(i+1)+": ");
			s = new Scanner(System.in);
			String palab = s.nextLine();
			palabras[i] = palab;
		}
		
		for (int i = palabras.length-1; i >= 0 ; i--) {
			System.out.println(palabras[i]);
		}
		
	}

}
