package br.com.conta.service;

import java.util.List;

import br.com.conta.repository.ContaRepository;
import br.com.conta.resource.request.ContaRequest;

public interface ContaServiceI {
	
	
	/**
	 * Busca contas
	 * @return
	 */
	List<ContaRepository> buscaContas();
	
	/**
	 * Salva uma conta
	 * @param conta
	 * @return
	 */
	ContaRepository salvaConta(ContaRequest conta);
}
