package Classes_e_Obejetos;

public class Casa {
	
	private String logradouro;
	
	
	public Casa (String endereco)
	{
		this.logradouro =  endereco;
		
	}
	
	public String getEnderecoCompleto ()
	{
		String EnderecoCompleto = logradouro;
		return EnderecoCompleto;
	}
	
}
