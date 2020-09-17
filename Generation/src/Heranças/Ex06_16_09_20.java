package Heran�as;

public class Ex06_16_09_20 extends Ex01_16_09_20  {

	private double valorVendas;
	private double comissao;
	
	public Ex06_16_09_20 (String nome, String sobrenome, String CPF, String Rg, double valorVendas, double comissao)
	{
		super (nome,sobrenome,CPF,Rg);
		this.valorVendas=valorVendas;
		this.comissao=comissao;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
		
	public void ValoresVendas()	
	{
		double x = getValorVendas() * (getComissao()/100);
		System.out.println("Valor da Comiss�o �: " + x + " Reais...");
	}
}