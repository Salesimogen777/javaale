package Exercícios;

import java.util.Scanner;

public class Exercício_06_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("num 1");
		double n1 = scanner.nextDouble();
		
		System.out.println("num 2");
		double n2 = scanner.nextDouble();
		
		System.out.println("Operador");
		char operacao = scanner.next().charAt(0);
		System.out.println(operacao);
		
		
		double resultado = 0;
		
		switch(operacao) {
		
			case '+':
				resultado = n1 + n2;
				break;
				default: 
				System.out.println("Operação invalida");
				}
		
		System.out.println(resultado);
		
		
		
		
		
		
	}

}
