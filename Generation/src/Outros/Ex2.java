package Outros;

import java.util.Scanner;

public class Ex2 {
	public static void main (String args[])
	
	{
		int anos, mes, dia, totalDias;
		
		Scanner ler = new Scanner (System.in);
			System.out.println(" Bem Vindo ao Calculo de dias! ");
			
			System.out.println(" \n Quantos anos vc tem ");						
			anos = ler.nextInt();
			
			
			System.out.println(" Qual � o mes do seu aniversaio ");
			mes = ler.nextInt();
			
			System.out.println("Qual � o dia no seu anivrsaio");
			dia = ler.nextInt();
			
			totalDias = anos*365 + mes*30 + dia;
					System.out.println("Total de dias �:" + totalDias);
			
	}

}
