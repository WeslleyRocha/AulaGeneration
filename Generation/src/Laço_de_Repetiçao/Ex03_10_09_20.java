package La�o_de_Repeti�ao;

import java.util.Scanner;

public class Ex03_10_09_20 {

	public static void main(String[] args) {
		
		int idade=0, menos20=0, maior50=0;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Escreva uma idade: " + "\nOU para -99 sair.");
		
		
		idade = ler.nextInt();
				
		while (idade!=-99)				
		
		{
			if (idade<=21)
			{
				menos20 = menos20 + 1; 
			}
			
			if (idade>=50)
			{
				 maior50 = maior50 + 1;
			}
							
		idade = ler.nextInt();	
			
		} 
		  System.out.println ("Total de pessoas com menos de 20 anos � : " + menos20);
		  System.out.println ("Total de pessoas com mais de 50 anos �: " + maior50);  
	
		
	}

}
