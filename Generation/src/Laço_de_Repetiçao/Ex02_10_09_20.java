package La�o_de_Repeti�ao;

import java.util.Scanner;

public class Ex02_10_09_20 {

	public static void main(String[] args) {
		
		int num=0, par=0, impar=0, cont=0; 
		
		Scanner ler = new Scanner (System.in); //"Ativar a "variavel" 
		
		
		for (cont=1; cont<=10; cont++)
			
		{
			System.out.println("Digite o n�mero:");
			num = ler.nextInt();

			if (num%2==0)
			{
				par = par + 1;
			}
			else if(num%2==1)
			{
				impar = impar + 1;
			}
			
		}
		System.out.println(" Foram encontrados " + par + " n�meros Pares");
		System.out.println(" Foram encontrados " + impar + " n�meros Impar");
	}

}
