package Heran�a_Polimorfismo;

public class Cavalo_Classe_Filha extends Animal_Classe_M�e {

	private String correr, som;
	
	public Cavalo_Classe_Filha ()
	
	{
		super ();
		this.correr=correr;		
	}

	public String getCorrer() 
	 {
		return correr;
	 }

	public void setCorrer(String correr)
	 {
		this.correr = correr;
	 }
		
	public String getSom() 
	 {
		return som;
	 }

	public void setSom(String som) 
	 {
		this.som = som;
	 }

	public String getNome()
	{
		return "\n  Nome do seu cavalo �: " + super.getNome() + "\n  Ele tem: " + super.getIdade() + " Anos... \n  O som que ele faz �: " +
		this.getSom() + "\n  Ele " + this.getCorrer() + "\n";
	}


	
}
