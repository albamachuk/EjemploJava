package com;
import java.util.*;
public class Actividad12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero, valor_absoluto ; 
		
		System.out.println("introduce un numero ");
		numero = scanner.nextInt();
		
		valor_absoluto = Math.abs(numero);
		System.out.println("el numero es: " +valor_absoluto);
	

	}

}
