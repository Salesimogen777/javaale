package Exercícios;

import java.util.Scanner;

public class Exercício_05_06 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);	
		
		System.out.println("Digite o nome da peça desejada: ");
		String peca1 = scanner.nextLine();
		
		System.out.println("Qual a quantidade de " + peca1 + " você deseja?");
		String quantidadePeca1 = scanner.nextLine();
		float quantidadePeca1Float = Float.parseFloat(quantidadePeca1);
		
		System.out.println("Qual é o valor da " + peca1 + " que você deseja?");
		String valorPeca1 = scanner.nextLine();
		float valorPeca1Float = Float.parseFloat(valorPeca1);
		
		float valorTotalPeca1 = quantidadePeca1Float * valorPeca1Float; 
		
		System.out.println("O valor de " + quantidadePeca1Float + " unidades de " + peca1 + ", será de R$ " + valorTotalPeca1 );
		System.out.println("");
		
		System.out.println("Deseja mais algo? " + "Se sim, digite o nome do produto desejado.");
		
        String peca2 = scanner.nextLine();
		
		System.out.println("Qual a quantidade de " + peca2 + " você deseja?");
		String quantidadePeca = scanner.nextLine();
		float quantidadePeca2Float = Float.parseFloat(quantidadePeca1);
		
		System.out.println("Qual é o valor da " + peca1 + " que você deseja?");
		String valorPeca2 = scanner.nextLine();
		float valorPeca2Float = Float.parseFloat(valorPeca1);
		
		float valorTotalPeca2 = quantidadePeca2Float * valorPeca2Float; 
		
		float valorTotalPeca1ePeca2 = valorTotalPeca2 + valorTotalPeca1;
		
		System.out.println("O valor de " + quantidadePeca1Float + " unidades de " + peca1 + " + O valor de " + quantidadePeca2Float + " unidades de " + peca2 + "será de R$" + valorTotalPeca1ePeca2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		

	}

}
