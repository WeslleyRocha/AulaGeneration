package Classes_e_Obejetos;

public class Eletronico {
	
	//DECLARA��O DE ATRIBUTOS "VARIAVEIS"
	private String produto;
	private String marca;
	private String modelo;
	private String valor;
	private String numSerie;

	
	//METODO DE CONTRU��O 
	public Eletronico (String produto, String marca, String modelo, String valor, String numSerie)
	
	{
		//"ATIVANDO" AS VARIAVEIS 
		this.produto = produto;
		this.marca=marca;
		this.modelo = modelo;
		this.valor=valor;
		this.numSerie=numSerie;
	}
		
	
		//A��O DO COMANDO
		public String gateletronicos()
	{
		String eletronicos = produto + " " + marca + " " + modelo + " " + valor + " " +  numSerie;
		return eletronicos;
	}
	
}
