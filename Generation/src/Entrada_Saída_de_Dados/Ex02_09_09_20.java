package Entrada_Saída_de_Dados;

import java.util.Scanner;

public class Ex02_09_09_20 {

	public static void main(String[] args) {
		
		int a, b, c;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Entre com o Primeiro valor:");
		a = ler.nextInt();	
		
		System.out.println("Entre com o Segundo valor:");
		b = ler.nextInt();
		
		System.out.println("Entre com o Terceiro valor:");
		c = ler.nextInt();
		
		if (a<=b && b>=c) 
		{
			System.out.println(a + " , " + b + " , " + c + " , ");
		}
		
		else if (a<=c && c<=b)
		{
			System.out.println(a + " , " + c + " , " + b + " , ");
		}
		
		else if (b<=a && a<=c)
		{
			System.out.println(b + " , " + a + " , " + c + " , ");
		}
		
		else if (a<=c && c<=b)
		{
			System.out.println(a + " , " + c + " , " + b + " , ");
		}	
	}
	

}
