package Projeto_Modulo_1;

import java.util.Scanner;

public class ProjetoLoja extends ProjetoCliente {
	
	Scanner leia = new Scanner(System.in);

	int idProduto=4, nSerie, qntXiaomi=0, qntTV=0, qntPc=0;;
    String produto;

	int confirma��o=0;
    double  valorT=0;
    
	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public int getnSerie() {
		return nSerie;
	}

	public void setnSerie(int nSerie) {
		this.nSerie = nSerie;
	}

	
	public int getQntXiaomi() {
		return qntXiaomi;
	}

	public void setQntXiaomi(int qntXiaomi) {
		this.qntXiaomi = qntXiaomi;
	}

	public int getQntTV() {
		return qntTV;
	}

	public void setQntTV(int qntTV) {
		this.qntTV = qntTV;
	}

	public int getQntPc() {
		return qntPc;
	}

	public void setQntPc(int qntPc) {
		this.qntPc = qntPc;
	}

	public double getValorT() {
		return valorT;
	}

	public void setValorT(double valorT) {
		this.valorT = valorT;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	    
	public ProjetoLoja(String nome, String sobrenome, String email, int telefone, String endereco, int RG, int CPF) {
		super(nome, sobrenome, email, telefone, endereco, RG, CPF);
		/*this.idProduto = idProduto;
		this.nSerie = nSerie;
		this.produto = produto;
		this.marca = marca;
		this.modelo = modelo;
		*/
		
	}
	
	public void produto()
	{
		
		System.out.println("\n\n");
		System.out.println("Ol�, "+super.getNome()+"! Seja bem vindo/a!!");
		System.out.println("Pressione um dos valores abaixo para adicionar "
				+ "ao carrinho ou pressione 0 para sair. ");
		System.out.println("\n\n");
		
		System.out.println("\nMENU:");
		System.out.println("1- XIAOMI. Pre�o R$: 2500");
		System.out.println("2- COMPUTADOR. Pre�o R$: 6999,99");
		System.out.println("3- TELEVIS�O. Pre�o R$: 3499,90");
		setIdProduto(leia.nextInt());
		if (getIdProduto() == 1)
		{
			System.out.println("Foi adicionado ao seu carrinho um Xiaomi!");
			qntXiaomi++;
			valorT=valorT +2500;
			System.out.println("Valor total no carrinho R$: "+valorT);
		}else if(getIdProduto()== 2)
		{
			System.out.println("Foi adicionado ao seu carrinho um computador!");
			qntPc++;
			valorT=valorT +6999.99;
			System.out.println("Valor total no carrinho R$: "+valorT);
		}else if(getIdProduto() == 3) {
			System.out.println("Foi adicionado ao seu carrinho uma Televis�o!");
			qntTV++;
			valorT=valorT +3499.90;
			System.out.println("Valor total no carrinho R$: "+valorT);
		}
		
		while(getIdProduto()!=0) {
			System.out.println("\nGostaria de mais algum item?");
			System.out.println("\nMENU:");
			System.out.println("1- XIAOMI. Pre�o R$: 2500,00");
			System.out.println("2- COMPUTADOR. Pre�o R$: 6999,99");
			System.out.println("3- TELEVIS�O. Pre�o R$: 3499,90");
			System.out.println("0- PARA FINALIZAR A COMPRA\n");
			
			setIdProduto(leia.nextInt());

		if (getIdProduto() == 1)
		{
			System.out.println("\nFoi adicionado ao seu carrinho um Xiaomi!");
			qntXiaomi++;
			valorT=valorT +2500;
			System.out.println("\nValor total no carrinho R$: "+valorT);
		}else if(getIdProduto()== 2)
		{
			System.out.println("\nFoi adicionado ao seu carrinho um computador!");
			qntPc++;
			valorT=valorT +6999.99;
			System.out.println("\nValor total no carrinho R$: "+valorT);
		}else if(getIdProduto() == 3) {
			System.out.println("\nFoi adicionado ao seu carrinho uma Televis�o!");
			qntTV++;
			valorT=valorT +3499.90;
			System.out.println("\nValor total no carrinho R$: "+valorT);
		}
		}
		if (getIdProduto() == 0 && valorT == 0)
		{
			System.out.println("\n\n");
			System.out.println("Poxa... fica para a pr�xima."
					+ " Mesmo assim agradecemos a sua visita"
					+ " e te esperaremos ansiosamente pelo seu retorno. ");
		}else {
			System.out.println("\n\n");
			System.out.println("Voc� comprou: \n"+qntXiaomi+" Xiaomi\n"
			+qntTV+" televis�o/televis�es\n"+qntPc+" computadores/computador"+"\nValor total R$: "+valorT);
			System.out.println("");
			System.out.println("Enviaremos o/os produto(s) no endere�o "+super.getEndereco()+""
					+ " dentro de sete dias. "
					+ "Caso tivermos qualquer tipo de problema em nossa entrega, entraremos em contato"
					+ "\ncom o email: "+super.getEmail()+
					"\ncom o n�mero de telefone: "+super.getTelefone()
					+"\ncom o endere�o: "+super.getEndereco());
			System.out.print("\n");
			System.out.println("Os dados informados est�o corretos? Se sim,"
					+ " digite 1 para confirmar"
					+ ", caso contr�rio digite 2 para atualizar o cadastro.");
			confirma��o = leia.nextInt();
			if (confirma��o==1)
			{
				System.out.println("");
				System.out.println("Obrigado por comprar em nossa loja! Volte sempre!");
				System.out.println("Programa finalizado.");
			}else if(confirma��o == 2)
			{
				setAtualiza��o();
				System.out.println(getCadastro());
				System.out.println("Obrigado por comprar em nossa loja! Volte sempre!");
				System.out.println("Programa finalizado.");
			}
		}
	}	
}

	
