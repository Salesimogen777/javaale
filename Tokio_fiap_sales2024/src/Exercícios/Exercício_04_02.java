package Exercícios;

 import java.util.Scanner;

import java.util.Scanner;
 
public class Exercício_04_02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		String nome = scanner.nextLine();
		
		System.out.println("Digite sua idade");
        String idade = scanner.nextLine();
		
		
		System.out.printf("Olá %s!. Você tem %d anos.\n", nome, idade);
		
		System.out.println("Digite seu salário");
		String salario = scanner.nextLine();
		
		System.out.printf("Você recebe R$%f por mês\n", salario);
		
		System.out.println("O nome do seu filho é" + scanner.nextLine());
				
	}

}
