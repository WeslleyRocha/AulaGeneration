package Vetor;

import java.util.Scanner;

public class Ex03_11_09_20 {

	public static void main(String[] args) {
		
		int [][] num = new int [3] [3];
		Scanner ler = new Scanner(System.in);
		int cont=0;
		
		for (int x=0; x<3; x++) //Correr o X pela linha
		{
				for (int y=0; y<3; y++) // Correr o Y pela coluna
			
				{
					System.out.printf("Entre com o numero: ");
					num [x][y] = ler.nextInt();
				
						if (num[x][y] > 10 )
							{ 
								cont++;
							}
				}
				 
		}
		
		System.out.println(" Foi encontrado " + cont + " valores maior que 10! ");		
					
	}

}
