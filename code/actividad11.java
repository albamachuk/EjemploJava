package com;
import java.util.Scanner;
public class actividad11 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
		  System.out.println("cuantos kilos de mazanas has vendido?");
		  int manzanas = scanner.nextInt();
		  System.out.println("cuantos kilos peras has vendido?");
		  int peras = scanner.nextInt();
		  
		  System.out.println("cuantos kilos de mazanas has vendido 2 semestre?");
		  int manzanas2 = scanner.nextInt();
		  System.out.println("cuantos kilos peras has vendido 2 semestre?");
		  int peras2 = scanner.nextInt();
		  
		  System.out.println("cuanto es el total ?");
		  final double preciomanzana = 2.35;
		  final double preciopera = 1.95 ;
		System.out.println(manzanas * preciomanzana);
		System.out.println(peras * preciopera);
		System.out.println(manzanas2 * preciomanzana);
		System.out.println(peras2 * preciopera);
		double manzanaBeneficio ;
		double peraBeneficio ;
		double totalBeneficiomanzana ;
		double totalBeneficiopera ;
		
		System.out.println((manzanas * preciomanzana) + (manzanas2 * preciomanzana));
		System.out.println((peras * preciopera) + (peras2 * preciopera));
		System.out.println("total de las ganancias" + totalBeneficioManzana +);
		
		
		
		
	}

}
