package Exercícios;

import java.util.Scanner;

public class Exercício_05_07 {

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
		
		System.out.println("Insira o valor da cédula que você deseja para pagar: ");
		String valorCedula = scanner.nextLine();
		Float valorCedulaFloat = Float.parseFloat(valorCedula);
		
		float troco = valorCedulaFloat - valorTotalPeca1;
		
		System.out.println("Seu troco é de: R$ " + troco);
		
		
		
		
		
		
		
		
		
		
	}

}
