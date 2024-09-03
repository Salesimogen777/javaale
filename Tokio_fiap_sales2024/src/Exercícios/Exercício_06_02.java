package Exercícios;

import java.util.Scanner;

public class Exercício_06_02 {

	public static void main(String[] args) {
		// Faça um programa que peça dois números e imprima o maior deles, e informe caso
		// eles sejam iguais.

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		int num1 = scanner.nextInt();
		
		System.out.println("Digite o segundo numero");
		int num2 = scanner.nextInt();
		
		if (num1 > num2) { 
			System.out.println(num1);
		}else if(num1 == num2) {
			System.out.println("Igual");
		}else {
			System.out.println(num2);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
