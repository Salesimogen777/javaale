package Exercícios;

import java.util.Scanner;

public class Exercício_05_04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua primeira nota: ");
		String nota1 = scanner.nextLine();
		float nota1Float = Float.parseFloat(nota1);
		
		System.out.println("Digite sua segunda nota: ");
		String nota2 = scanner.nextLine();
		float nota2Float = Float.parseFloat(nota2);
		
		float somaMedia =  nota1Float + nota2Float;
		float media = somaMedia / 2f;
		System.out.println("Sua média é: " + media);
		

	}

	private static float parseFloat(String nota1) {
		// TODO Auto-generated method stub
		return 0;
	}

}
