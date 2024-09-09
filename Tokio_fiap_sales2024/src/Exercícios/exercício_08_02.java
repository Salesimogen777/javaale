package Exercícios;

import java.util.Calendar;

public class exercício_08_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar c = Calendar.getInstance();
		
		int diaSemana = c.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("Dia da semana: " + c.get(Calendar.DAY_OF_WEEK));
		
		if(diaSemana == 3 || diaSemana == 7) {
			System.out.println("Hoje tem feira");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
