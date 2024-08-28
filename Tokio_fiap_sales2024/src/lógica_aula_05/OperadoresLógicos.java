package lógica_aula_05;

public class OperadoresLógicos {

	public static void main(String[] args) {
	
    // LÓGICA E (&&)
	// EMAIL	SENHA	LOGIN
	// TRUE		TRUE	TRUE
	// TRUE		FALSE	FALSE
	// TRUE		TRUE	FALSE
	// TRUE		FALSE	FALSE
		
	boolean verificaEmail = true;
	boolean verificaSenha = true;
	
	boolean logicaE = verificaEmail && verificaSenha;
	System.out.println(logicaE);
		
	// LÓGICA OU ||
	// JOGO		SOL		CHURRAS
	// TRUE		TRUE	TRUE
	// TRUE		FALSE	TRUE
	// FALSE	TRUE	TRUE
	// FALSE	FALSE	FALSE
		
	boolean logicaOU = false || false;
	System.out.println(logicaOU);
		
	// OPERADOR DE NEGAÇÃO !
		
		boolean negacao = !false;
		System.out.println(negacao);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
