package Heranças;

public class Ex02_16_09_20 extends Ex01_16_09_20 {

	private double divida, credito;
	
	public Ex02_16_09_20(String nome, String sobrenome, String CPF, String Rg, double divida, double credito)
	{
		super (nome,sobrenome,CPF,Rg);
		this.divida=divida;
		this.credito=credito;
	}

	public double getDivida() {
		return divida;
	}

	public void setDivida(double divida) {
		this.divida = divida;
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}
	
	public void saldo()
	{		
		double saldo = getDivida() - getCredito();
		System.out.println("Valor do Saldo é: " + saldo);
	}
	
		
}
