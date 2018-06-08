package br.com.conta.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.conta.resource.request.ContaRequest;
import br.com.conta.service.ContaService;

@RestController
@RequestMapping("/conta")
public class ContaResource {
	
	@Autowired
	private ContaService contaService;
	
	@GetMapping
	public ResponseEntity<?> getConta() {
		return ResponseEntity.ok(contaService.buscaContas());
	}
	
	@PostMapping
	public ResponseEntity<?> postConta(@RequestBody ContaRequest conta){
		return ResponseEntity.ok(contaService.salvaConta(conta));
	}
	
}
