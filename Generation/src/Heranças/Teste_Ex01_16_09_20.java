package Heran�as;

public class Teste_Ex01_16_09_20 {

	public static void main(String[] args)
	{
		
		Ex01_16_09_20 pessoa = new Ex02_16_09_20 ("Franco", "LaFenina", "123456", "123456", 20.00 , 5.60);
		Ex01_16_09_20 pessoa1 = new Ex02_16_09_20 ("Matheus", "Belo", "45689656", "123456", 11.50 , 4.60);
		Ex01_16_09_20 pessoa2 = new Ex02_16_09_20 ("Alex", "Menino", "546786", "123456", 15.99 , 7.60 );
		Ex01_16_09_20 pessoa3 = new Ex02_16_09_20 ("Weslley", "Rocha", "6465456", "123456", 78.80 , 7.90 );
		Ex01_16_09_20 pessoa4 = new Ex02_16_09_20 ("Vanessa", "Pereira", "6454656", "123456", 90.77 , 8.00);
		
		
		pessoa.mostraTela();
		pessoa.saldo();
		
		
		pessoa1.mostraTela();
		pessoa.saldo();
		
		pessoa2.mostraTela();
		pessoa2.saldo();
		
		pessoa3.mostraTela();
		pessoa3.saldo();
		
		pessoa4.mostraTela();
		pessoa4.saldo();
		

	}

}
