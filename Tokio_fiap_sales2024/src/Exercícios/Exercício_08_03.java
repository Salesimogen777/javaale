package Exercícios;

import java.util.Scanner;

public class Exercício_08_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);

System.out.println("Abra seu coração");		
String txt = scanner.nextLine();

int ctmaius = 0, ctnum = 0, ctminus = 0;

//looping para percorrer toda a string s

for (int i = 0; i < txt.length(); i++) {
	
//verificando se é um caractere alfabético maiúsculo
	
if ((txt.charAt(i) >= 'A') && (txt.charAt(i) <= 'Z')) {
ctmaius = ctmaius + 1;
}

//verificando se é um caractere alfabético minúsculo

if ((txt.charAt(i) >= 'a') && (txt.charAt(i) <= 'z')) {
	ctminus = ctminus + 1;
}
//verificando se é um caractere numérico

if ((txt.charAt(i) >= '0') && (txt.charAt(i) <= '9')){
ctnum = ctnum + 1;
}
}	
		
System.out.println(ctmaius);		
System.out.println(ctminus);		
System.out.println(ctnum);		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
