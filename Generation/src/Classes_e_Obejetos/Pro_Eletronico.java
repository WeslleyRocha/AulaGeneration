package Classes_e_Obejetos;

public class Pro_Eletronico {

	public static void main(String[] args) 
	{
		Eletronico produtos = new Eletronico (" Matheus - Celular", " - Samsung", " - S 20 Plus" ," - R$:3.000" , " - 555784462510");
		Eletronico produtos1 = new Eletronico (" Francco - Celular", " - Xiaomi", " - Lite 10" , " - R$:2.000" , " - 645465464654");
		Eletronico produtos2 = new Eletronico (" Alex - Celular", " - iPhone", " - Iphone XX" , " - R$:10.000" , " - 557787405650");
		
		System.out.println(produtos.gateletronicos());
		System.out.println(produtos1.gateletronicos());
		System.out.println(produtos2.gateletronicos());
				
	}

}
