package Outros;

import java.util.Scanner;

public class Ex04_09_09_20 {

	public static void main(String[] args)
	
	{
	
		float numero, rair;
		
		Scanner ler = new Scanner (System.in);
		System.out.println("Digite um numero qualquer: ");
		numero = ler.nextFloat();
		
		if (numero%2.0==0)
		{
			System.out.println("Numero digitado � PAR, Rais Quadrada � " + Math.sqrt(numero));
					
		}else System.out.println("Numero digitado � IMPAR, Numero levado ao Quadrado � " + (numero*2));
	}	

}
