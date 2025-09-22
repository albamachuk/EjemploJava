package com;
import java.util. * ;
public class actividad14 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		         System.out.print("Ingresa un número decimal: ");
		         double numeroDecimal = scanner.nextDouble();

		         long numeroRedondeado = Math.round(numeroDecimal);

		         System.out.println("Número redondeado: " + numeroRedondeado);

		     

	}
}