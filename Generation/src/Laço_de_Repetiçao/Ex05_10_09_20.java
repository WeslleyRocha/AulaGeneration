package La�o_de_Repeti�ao;

import java.util.Scanner;

public class Ex05_10_09_20 {

	public static void main(String[] args) {
		
		int num, soma=0; 
		System.out.println("Digite os n�meros que deseja somar, Ao final 0 para sair...");
			Scanner ler = new Scanner(System.in);
				
		do 
		{
					
			num = ler.nextInt();
			
			soma = num + soma;		 
			
			
		} while (num!=0);
		System.out.println("A soma de todos os numeros digitados foi: " + soma);
	}

}
