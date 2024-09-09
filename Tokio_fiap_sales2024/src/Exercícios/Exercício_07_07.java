package Exercícios;

import java.util.Scanner;

public class Exercício_07_07 {

	public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.println("Digite a média dos seus alunos");
double media = scanner.nextInt();


double nota;

do {
System.out.println("Digite as notas dos alunos");
nota = scanner.nextDouble();
if(nota>media) {
	System.out.println("Nota maior que a média");
}else {
	System.out.println("Nota menor que a média");
}
}while(true);
		
		
		
		
		
		
		
		
		
		
	}

}
