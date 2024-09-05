package Exercícios;

import java.util.Scanner;

public class Exercício_07_04 {

	private static String resposta;

	public static void main(String[] args) {
		//Faça um programa que receba 10 valores digitados pelo usuário e, ao final, informe
		//qual é a soma deles.

		Scanner scanner = new Scanner(System.in);
		
		int soma = 0, n = 0;
	 
		String resposta;
		
		do {
		System.out.println("Digite Um numero");
		n = Integer.parseInt(scanner.nextLine());
		soma += n;
		
		System.out.println("soma total:" + soma);
		
		System.out.println("Deseja continuar?");
		resposta = scanner.nextLine();
		} while(resposta.equals("sim"));
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
	}

}
