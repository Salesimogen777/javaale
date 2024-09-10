package LógicaAula09;

public class Vetores {

	public static void main(String[] args) {
		// VETOR
		// LADO ESQUERDO : DECLARAÇÃO DO VETOR DE NUM INTEIRO
		// LADO DIREITO: INSTACIAMOS O VETOR COM 10 POSIÇÕES
		int[] vetorInteiros = new int[10]; 
		vetorInteiros[0] = 10; //COLOCANDO O VALOR 10 NA POSI
		vetorInteiros[1] = 1999; //COLOCANDO O VALOR 1999
		
		System.out.println(vetorInteiros[0]);
		
		int anoNascimento = vetorInteiros[1];
		System.out.println("Ano nascimento: " + anoNascimento);
		
		//ACESSANDO A POSIÇÃO VIA VARIAVEL
		int posicao = 0;
		System.out.println(vetorInteiros[posicao]);
		
		
		//-------------------------------------------
		
		//DCLARAÇÃO DE UMA LISTA DE 4 FRUTAS
		
		String[] listaFrutas = new String[4];
		
		listaFrutas[0] = "Morango";
		listaFrutas[1] = "Uva";
		listaFrutas[2] = "Pera";
		listaFrutas[3] = "Pitaya";
		
		System.out.println();
		System.out.println("Fruta Pos 1: " + listaFrutas[1]);
		
		//OUTRO JEITPO DE DECLARAR
		String[] listaFrutas2 = {"Melancia", "Abacaxi", "Atemoia", "Banana"};
		// listaFrutas2[0] = "Melancia"
		// listaFrutas2[1] = "Abacaxi"
		// listaFrutas2[2] = "Atemoia"
		// listaFrutas2[3] = "Banana"
		// listaFrutas2.length = 4
		
		int qntdFrutas = listaFrutas2.length;
		System.out.println(qntdFrutas);
		System.out.println();
		
		// FOR INDEXADO
		for(int i = 0; i<listaFrutas2.length; i++) {
		System.out.println(listaFrutas2[i]);
		}
		System.out.println();
		// FOR EACH
		// CRIAR UMA LISTA DE NUMEROS 
		
		int[] numeros = {16, 24, 29, 33};
		// FOR EACH --> PERCORRE A LISTA E ACESSA OS VALORES DAS POSIÇÕES
		
		for(int numero: numeros) {
			System.out.println(numero);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
