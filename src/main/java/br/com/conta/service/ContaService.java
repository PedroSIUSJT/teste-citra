package br.com.conta.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.conta.repository.ContaRepository;
import br.com.conta.repository.ContaRepositoryI;
import br.com.conta.resource.request.ContaRequest;

@Service
public class ContaService implements ContaServiceI{
	
	@Autowired
	private ContaRepositoryI contaRepository;
	
	@Override
	public List<ContaRepository> buscaContas(){
		return contaRepository.findAll();
	}
	
	@Override
	public ContaRepository salvaConta(ContaRequest contaRequest) {
		ContaRepository conta = new ContaRepository();
		conta.setNome(contaRequest.getNome());
		conta.setSaldo(new BigDecimal("0"));
		conta.setDataAbertura(LocalDate.now().toString());
		return contaRepository.save(conta);
	}
}
