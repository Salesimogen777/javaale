package lógica_aula_05;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		float num1 = 9f;
		float num2 = 10f;
		
		System.out.println(num1);
		System.out.println(num2);
		
		float soma = num1 + num2;
		System.out.println("Soma: " + soma);
		
		float subtracao = num1 - num2;
		System.out.println("Subtracao: " + subtracao);
		
		float multiplicacao = num1 * num2;
		System.out.println("Multi: " + multiplicacao);
		
		float divisao = num1 / num2;
		System.out.println("Divisão: " + divisao);
		
		float resto = num1 % num2;
		System.out.println("Resto: " + resto);
		
		
		// OPERADORES UNÁRIOS
		
		int numero = 15;
		System.out.println("");
		System.out.println(numero);
		
		numero++;
		System.out.println(numero);
		System.out.println(numero++);
		
		System.out.println(numero);
		System.out.println(++numero);
		
		System.out.println(numero);
		System.out.println(numero+1);
		System.out.println(numero);
		
		// OPERADORES DE ATRIBUIÇÃO
		
		float number = 5f;
		
		System.out.println(" ");
		System.out.println(number);
		
		number += 8;
		System.out.println(number);
		
		number /= 2;
		System.out.println(number);
		
	}
  
}
