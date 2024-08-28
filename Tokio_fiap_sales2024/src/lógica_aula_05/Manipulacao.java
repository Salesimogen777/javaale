package lógica_aula_05;

import java.util.Scanner;

public class Manipulacao {

	public static void main(String[] args) {
		
		double salario = 1416.33;
		String salarioStr = Double.toString(salario);
		
		System.out.println(salario + salario);
		System.out.println(salarioStr + salario);
		
		System.out.println(" ");
		
		String idade = "25";
		int idadeinteiro = Integer.parseInt(idade);
		
		System.out.println(idadeinteiro);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o preço sugerido: ");
		String preco = scanner.nextLine();
		
		float precoFloat = Float.parseFloat(preco);
		
		System.out.println(preco + preco);
		System.out.println(precoFloat + precoFloat);
;
	}

}
