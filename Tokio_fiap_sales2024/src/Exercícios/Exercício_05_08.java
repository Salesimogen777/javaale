package Exercícios;

import java.util.Scanner;

public class Exercício_05_08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite o valor, em real, a ser convertido: ");
	String valorReal = scanner.nextLine();
	Float valorRealFloat = Float.parseFloat(valorReal);
	
	Float valorDollar  = valorRealFloat / 5.64f;
	Float valorEuro = valorRealFloat / 6.23f;
	Float valorPesoArgentino = valorRealFloat / 0.0059f;
	Float valorLibraEsterlina = valorRealFloat / 7.4f;
	Float valorIene = valorRealFloat / 0.039f;
		
	System.out.println("A conversão em cada moeda no dia 29/08/24 é\n" 
		+ "Real: " + valorRealFloat
		+ "\nDollar: " + valorDollar
		+ "\nEuro: " + valorEuro
		+ "\nPeso Argentino: " + valorPesoArgentino
		+ "\nLibra Esterlina: " + valorLibraEsterlina
		+ "\nIene: " + valorIene);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
