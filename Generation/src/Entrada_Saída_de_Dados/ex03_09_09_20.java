package Entrada_Sa�da_de_Dados;

import java.util.Scanner;

public class ex03_09_09_20 {
	public static void main (String args[])
	{
		int idade;
		
		Scanner ler = new Scanner (System.in);
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
		
				
			if (idade>=10 && idade<=14)
			{
				System.out.println(" Categoria Infatil ! ");
			}
		
			
			else if  (idade>=15 && idade<=17) 
			{
				System.out.println(" Categoria Juvenil ! ");
			}
			
		
			else if (idade>=18 && idade<=25)
			{
				System.out.println(" Categoria Adulto ! ");
			}
			
			
		else System.out.println(" Categoria Invalida ! ");
	}			
}

