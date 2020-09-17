package Herança_Polimorfismo;

public class Cachoro_Classe_Filha extends Animal_Classe_Mãe {

	private String correr, som;
	
	public Cachoro_Classe_Filha ()
	
	{
		super ();
		this.correr=correr;		
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	public String getNome()
	{
		return "  Nome do seu cachorro é: " + super.getNome() + "\n  Ele tem: " + super.getIdade() + " Anos... \n  O som que ele faz é: " +
		this.getSom() + "\n  Ele " + this.getCorrer() + "\n";
	}
}
