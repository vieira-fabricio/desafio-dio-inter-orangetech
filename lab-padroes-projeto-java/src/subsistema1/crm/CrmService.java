package subsistema1.crm;

public class CrmService {
	
	private CrmService() {
		super();
	}
	
	public static void GravarCliente(String nome, String cep, String cidade, String estado) {
		 
		System.out.println("Cliente salvo no sistema de CRM:");
		System.out.println(nome);
		System.out.println(cep);
		System.out.println(cidade);
		System.out.println(estado);
	}
	
	public static void retornarCliente(String nome, String cep, String cidade, String estado) {
		 
		System.out.println("Cliente encontrado no sistema de CRM:");
		System.out.println(nome);
		System.out.println(cep);
		System.out.println(cidade);
		System.out.println(estado);
	}

}
