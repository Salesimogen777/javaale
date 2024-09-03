package Exercícios;

public class Exercício_06_03 {

	public static void main(String[] args) {
		/* Faça um programa para a leitura de quatro notas parciais de um aluno. O programa
		deve calcular a média alcançada pelo aluno e apresentar:
			▪ A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
			▪ A mensagem "Em recuperação", se a média for entre cinco, incluindo o cinco, e sete;
			▪ A mensagem "Reprovado", se a média for menor que cinco.
*/
		
		float nota1 = (float) 5;
		float nota2 = (float) 5;
		float nota3 = (float) 5;
		float nota4 = (float) 5;
		
	   float media =  ((nota1 + nota2 + nota3 + nota4) / 4);
		
		if (media >= 7) {
			System.out.println("Aprovado");
		} else if(media < 5) {
			System.out.println("Reprovado");
		}else {
			System.out.println("Recuperação");
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
