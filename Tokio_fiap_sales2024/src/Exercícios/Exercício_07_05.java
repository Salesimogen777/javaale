package Exercícios;

import java.util.Scanner;

public class Exercício_07_05 {

	public static void main(String[] args) {
		// Faça um programa que receba 12 valores digitados pelo usuário e, ao final, informe
		// qual é o maior deles.
		
		Scanner scanner = new Scanner(System.in);
		
		int maior, n = 0;
		
		System.out.println("Digite um numero");
		n = scanner.nextInt();
		maior = n;
		System.out.println("Dentre os numeros, o maior é: " + maior);
		
		while(true) {
		System.out.println("Digite outro numero");
		n = scanner.nextInt();
		if (n > maior) {
			maior = n;
			System.out.println("Dentre os numeros, o maior é: " + maior);
		}else {
			maior = maior;
			System.out.println("Dentre os numeros, o maior é: " + maior);
		}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
