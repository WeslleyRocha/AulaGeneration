package Heranças;

public class Ex04_16_09_20 extends Ex01_16_09_20{

	private double ajudadeCusto;
	
	public Ex04_16_09_20 (String nome, String sobrenome, String CPF, String Rg, double ajudadeCusto)
	{
		super (nome,sobrenome,CPF,Rg);
		this.ajudadeCusto=ajudadeCusto;
	}

	public double getAjudadeCusto() {
		return ajudadeCusto;
	}

	public void setAjudadeCusto(double ajudadeCusto) {
		this.ajudadeCusto = ajudadeCusto;
	}
}
