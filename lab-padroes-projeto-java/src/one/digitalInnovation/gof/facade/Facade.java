package one.digitalInnovation.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {
	
	public void migrarCliente(String nome, String cep) {
		
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		
		CrmService.GravarCliente(nome, cep, cidade, estado);
	}
	
	public void consultaCliente(String nome, String cep) {
		if(cep == "" && nome == "") {
			System.out.println("Cliente não encontrado no sistema de CRM!");
		} else {
			String cidade = CepApi.getInstancia().recuperarCidade(cep);
			String estado = CepApi.getInstancia().recuperarEstado(cep);
			
			
			CrmService.retornarCliente(nome, cep, cidade, estado);
		}
		
	}

}
