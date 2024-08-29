package Exercícios;

import java.util.Scanner;

public class Exercício_05_05 {

	public static void main(String[] args) {
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua primeira nota: ");
		String nota1 = scanner.nextLine();
		float nota1Float = Float.parseFloat(nota1);
		
		System.out.println("Digite sua segunda nota: ");
		String nota2 = scanner.nextLine();
		float nota2Float = Float.parseFloat(nota2);
		
		float nota1FloatPonderada = nota1Float * 4f; 
		float nota2FloatPonderada = nota2Float * 6f; 
		
		float mediaPonderada = (nota1FloatPonderada + nota2FloatPonderada) / 10f;
		
		System.out.println("Sua média ponderada é: " + mediaPonderada);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	private static float parseFloat(String nota2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
