package Outros;

import java.util.Scanner;

public class Ex3 {
	public static void main (String args[])
	{
		int hora, minutos, segundos, totalTempo;
			Scanner ler = new Scanner (System.in);
			
			System.out.println(" Bem Vindo ao Calculo de Tempo ! ");
			
			System.out.println("\n Quantos segundos tem o evento: ");						
			totalTempo = ler.nextInt();
			
			minutos = (totalTempo%3600)/60;
			hora = (totalTempo%63600)%60;
			segundos = totalTempo/3600;
			
			System.out.println("Horas \n" + minutos + " minutos \n " + hora + " seguntos ate o evento..." );
		
	}
}
