package tarea1;

import java.util.Scanner;

public class Tarea1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] palabras = new String[20];
		
		for (int i = 0; i < palabras.length; i++) {
			System.out.print("Palabra "+(i+1)+": ");
			palabras[i] = s.nextLine();
		}
		
		for (int i = palabras.length-1; i >= 0 ; i--) {
			System.out.println(palabras[i]);
		}
		
	}

}
