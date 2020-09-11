package Vetor;

import java.util.Scanner;

public class Ex02_11_09_20 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int[] num = new int[7];
		int x, soma=0, cont=0;
		
		
		for (x=1; x<=6; x++)
			{
			System.out.printf("Informe 6 numeros: ");			
			num [x] = ler.nextInt();		
			}
		
		System.out.printf("\n");
		
		for (x=1; x<=6; x++)
			{			
				if (num[x]%2==0)
					{
						System.out.println("Numeros pares digitados foi: " + num[x]);
						soma+=num[x]; 
					}					
			} 
		
		System.out.printf("\n");
		System.out.println("  Soma dos numeros pares:" + soma);
		System.out.printf("\n");
		
		for (x=1; x<=6; x++)
			{
				if (num[x]%2!=0) 
					{
						cont++;
						System.out.println("Números Impares digitado foi: " + num[x]);
					}
			}	 
		System.out.printf("\n");
		System.out.println("  Quantidade dos numeros impares foi: " + cont);
					
		}
		
		
		
	}


