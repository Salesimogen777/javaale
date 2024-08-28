package lógica_aula_05;

import java.util.Scanner;

public class Tipos_ {

	public static void main(String[] args) {
		
		float preço = 10.66f;
		float preço2 = (float) 12.90;
		
        System.out.println("float 01: " + preço);
        System.out.println("float 02: " + preço2);
        
        int preçointeiro = (int) 2.66;
        System.out.println("Inteiro: " + preçointeiro);
        
        int numerox = 6;
        double numeroxdouble = numerox;
        System.out.println(numerox);
        System.out.println(numeroxdouble);
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println( "");
        System.out.println("Digite um número: ");
        int numerointeiro = (int) scanner.nextDouble();
        
        Integer numerointeiroclass =  numerointeiro;
        
        System.out.println(numerointeiro);
        System.out.println(numerointeiroclass.getClass());
        
        
        
        
        
	}

}
