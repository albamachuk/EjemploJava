package com;
import java.util. * ;
public class actividad13 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		  double notas1, notas2, notas3, mediacurso ;
		  
	        System.out.print("Notas primer trimestre");
	        notas1 = scanner.nextDouble() ;
	        System.out.print("Notas segundo trimestre");
	        notas2 = scanner.nextDouble() ;
	        System.out.print("Notas tercer trimestre");
	        notas3 = scanner.nextDouble() ;
	       
	        mediacurso =(notas1 + notas2 +notas3) / 3 ;
	        System.out.println("que media tiene" + mediacurso ); 
	        
	}

}
