package Exercícios;

import java.util.Calendar;

public class Exercício_08_01 {

	
	public static void main(String[] args) {
	//
		
	Calendar c = Calendar.getInstance();
	int hora = c.get(Calendar.HOUR_OF_DAY);
	
    System.out.println(hora);
		
	if(hora<12) {
		System.out.println("Bom dia, fulano");
	}else {
		if(hora>=12 && hora<18){
			System.out.println("Boa tarde, fulano");
		}else {
			System.out.println("Boa noite, fulano");
		}
	}	
		
		
		
		
		
		
		
		
		
		
		

	}

}
