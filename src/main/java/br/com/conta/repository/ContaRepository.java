package br.com.conta.repository;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_CONTA")
public class ContaRepository {
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
	@Column(name="NOME")
	private String nome;
	
	@Column(name="SALDO")
    private BigDecimal saldo;
	
	@Column(name="DATA_ABERTURA_CONTA")
    private String dataAbertura;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public String getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	@Override
	public String toString() {
		
		return new StringBuilder()
		        .append("ID : "+ this.id)
		        .append("NOME : "+ this.nome)
		        .append("SALDO : "+ this.saldo)
		        .append("DATA DE ABERTURA DA CONTA : "+ this.dataAbertura)
		        .toString();
	}
}
