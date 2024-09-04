package lógica_aula_07;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		double notaA, notaB;
		
		do {
			System.out.println("Nota A");
			notaA = scanner.nextDouble();
		}
		while(notaA < 0 || notaA > 10);
		
		do {
			System.out.println("Nota B");
			notaB = scanner.nextDouble();
		}
		while(notaB < 0 || notaB > 10);
		
		double media = ((notaA + notaB)/2);
		System.out.println(media);
		
		
		
		
		
		
		
		
		
	}

}
