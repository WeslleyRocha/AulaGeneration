package Laço_de_Repetiçao;

public class Ex01_10_09_20 {

	public static void main(String[] args) {
		 	
		int num, soma=0;
			
		for (num=1000; num<=1999; num++)
		{
			
			if (num%11==5)
			
			{
				System.out.print("\n " + num);
				soma = soma + num;
			}				
		}	
		System.out.print("\n Resultado total: " + soma);
	}

}
