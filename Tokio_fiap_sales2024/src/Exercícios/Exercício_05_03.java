package Exercícios;

import java.util.Scanner;

public class Exercício_05_03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	System.out.println("Olá, digite seu nome por favor: ");
	String nome = scanner.nextLine();
		
	System.out.println("Olá " + nome + ", Você se indentifica com qual gênero das opções abaixo?\r\n"
			+ " [ M ] para masculino\r\n"
			+ " [ F ] para feminino\r\n"
			+ " [ O ] outro\r\n"
			+ " [ N ] não responder");	
	String genero = scanner.nextLine();
	
	System.out.println("O seu nome é: " + nome + " e seu Gênero é: " + genero + ".");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static Scanner nextLine() {
		// TODO Auto-generated method stub
		return null;
	}

}
